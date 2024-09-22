package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void checkGetSound() {
        Cat cat = new Cat(feline);

        Assert.assertEquals("Кошка мяукает", "Мяу", cat.getSound());
    }

    @Test
    public void checkGetFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedListOfFood);

        Assert.assertEquals(cat.getFood(), expectedListOfFood);
    }
}