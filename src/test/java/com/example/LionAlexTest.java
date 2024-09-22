package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LionAlexTest {

    @Mock
    private Feline feline;

    @Test
    public void checkAlexFriendsName() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals(List.of("Марти", "Глория", "Мелман"), lionAlex.getFriends());
    }

    @Test
    public void checkAlexPlaceOfLiving() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        String expected = "Нью-Йоркский зоопарк";
        assertEquals("Алекс живет в другом месте", expected, lionAlex.getPlaceOfLiving());
    }

    @Test
    public void checkAlexHaveKittens() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        assertEquals("У льва Алекса нет львят", 0, lionAlex.getKittens());
    }
}