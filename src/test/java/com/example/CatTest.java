package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline ;

    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(feline);

        Mockito.when(feline.eatMeat()).thenReturn(Collections.singletonList("Хищник"));

        List<String> expected = cat.getFood();
        List <String> actual = new ArrayList<>();
        actual.add("Хищник");

        assertEquals(expected, actual);

    }

    @Test
    public void getSound() {
        Cat cat = new Cat(feline);

        String expected = cat.getSound();
        String actual = "Мяу";

        assertEquals(expected, actual);
    }

}