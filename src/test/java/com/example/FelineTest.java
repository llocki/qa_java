package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTest {

    private final int kittens;

    public FelineTest(int kittens) {
        this.kittens = kittens;
    }

    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {1},
                {2},
                {3},
        };
    }

    @Test
    public void eatMeat() throws Exception {

        Feline feline = new Feline();
        List<String>  actual  = feline.eatMeat();

        List <String> expected = new ArrayList<>();
        expected.add("Животные");
        expected.add("Птицы");
        expected.add("Рыба");

        assertEquals(expected, actual);
    }

    @Test
    public void getFamily() {

        Feline feline = new Feline();
        String  actual = feline.getFamily();
        String expected = "Кошачьи";

        assertEquals(expected, actual);
    }

    @Test
    public void getKittens() {

        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetKittens() {

        Feline feline = new Feline();
        int actual = feline.getKittens(kittens);
        int expected = kittens;

         assertEquals(expected, actual);
    }

}