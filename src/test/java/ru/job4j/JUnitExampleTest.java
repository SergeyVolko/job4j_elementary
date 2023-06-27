package ru.job4j;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.*;

@Disabled("Need to fix impl")
class JUnitExampleTest {
    @Test
    void when5and5then25() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }

    @RepeatedTest(2)
    void when5and5then251() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }

    @Test
    @DisplayName("When 5 multi 5 should be 25")
    void when5and5then252() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }

    @Disabled
    @Test
    void when5and5then253() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }

    @Timeout(6)
    @Test
    void when5and5then254() throws InterruptedException {
        Thread.sleep(5000);
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }

    @Timeout(value = 5000, unit = TimeUnit.MILLISECONDS)
    @Test
    void when5and5then255() throws InterruptedException {
        Thread.sleep(3000);
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }
}