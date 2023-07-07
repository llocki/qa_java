package com.example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class LionTest {

    private final String sex;
    private final boolean hasMane;

//-----------------------------------------------------------------------------
    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }
//-----------------------------------------------------------------------------

    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},

        };
    }
//-------------------------------------------------------------------------------
    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void getKittens() throws Exception {

        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex ,feline);

        Mockito.when(feline.getKittens()).thenReturn(1);

        int actual = lion.getKittens();
        int expected = 1;

        String x = "Используйте";

        assertEquals(expected, actual);

    }

    //--------------------------------------------------------------------------------
    @Test
    public void doesHaveMane() throws Exception {

        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, feline);

        boolean actual = lion.doesHaveMane();
        boolean expected = hasMane;

        assertEquals( expected, actual);

    }
    //----------------------------------------------------------------------------
    @Test
    public void getFood () throws Exception {

        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex ,feline);

        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> actual = lion.getFood();

        List<String> expected = new ArrayList<>();
        expected.add("Животные");
        expected.add("Птицы");
        expected.add("Рыба");

        assertEquals( expected, actual);
    }
}
