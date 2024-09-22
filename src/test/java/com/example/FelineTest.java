package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void checkEatMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(feline.getFood("Хищник"), feline.eatMeat());
    }

    @Test
    public void checkGetFamily() {
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        assertEquals("Кошачьи", actualFamily);
    }

    @Test
    public void checkTestGetKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }
}