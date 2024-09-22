package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    @Test
    public void checkGetFamily() {
        String expectedMessage = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Animal animal = new Animal();
        assertEquals("Ошибка в перечне семейств",
                animal.getFamily(),
                expectedMessage
        );
    }

    @Test
    public void checkGetFood() {
        String expectedMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";

        Animal animal = new Animal();
        Exception exception = Assert.assertThrows(Exception.class, () ->
                animal.getFood(""));

        assertEquals(expectedMessage, exception.getMessage());
    }
}
