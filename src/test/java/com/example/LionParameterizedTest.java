package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)

public class LionParameterizedTest {

private Feline feline;
private final String sex;
private final boolean hasMane;

@Before
public void setUp() {
    feline  = Mockito.mock(Feline.class);
}

public LionParameterizedTest(String sex, boolean hasMane) {
    this.sex = sex;
    this.hasMane = hasMane;
}

@Parameterized.Parameters
    public static Object[][] lionParameterizedTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(hasMane, actual);
    }
}