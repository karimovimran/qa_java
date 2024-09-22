package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    private Feline feline;

    @Test

    public void checkCreateLionThrowsException() {
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = Assert.assertThrows(Exception.class, () ->
                new Lion(feline, ""));

        assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    public void checkGetKittens() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);

        assertEquals(1, lion.getKittens());
    }

    @Test
    public void checkGetFood() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedListOfFood);

        assertEquals(expectedListOfFood, lion.getFood());
    }
}