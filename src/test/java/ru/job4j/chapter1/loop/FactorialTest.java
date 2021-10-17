package ru.job4j.chapter1.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        Assert.assertEquals(120, Factorial.calc(5));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Assert.assertEquals(1, Factorial.calc(0));
    }
}