package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.within;

public class FitTest {

    private static final int MAN_OFFSET = 100;
    private static final int WOMAN_OFFSET = 110;

    @Test
    void whenManHeightIs187ThenWeightIs100dot05() {
        short heightMan = 187;
        double expectedWeight = 100.05;
        double actualWeight = Fit.idealWeight(heightMan, MAN_OFFSET);
        assertThat(actualWeight).isCloseTo(expectedWeight, within(0.01));
    }

    @Test
    void whenWomanHeightIs170ThenWeightIs69dot0() {
        short heightWoman = 170;
        double expectedWeight = 69.0;
        double actualWeight = Fit.idealWeight(heightWoman, WOMAN_OFFSET);
        assertThat(actualWeight).isCloseTo(expectedWeight, within(0.01));
    }

    @Test
    void whenManHeightIs100ThenWeightIs0() {
        short heightMan = 100;
        double expectedWeight = 0.0;
        double actualWeight = Fit.idealWeight(heightMan, MAN_OFFSET);
        assertThat(actualWeight).isEqualTo(expectedWeight);
    }

    @Test
    void whenWomanHeightIs110ThenWeightIs0() {
        short heightWoman = 110;
        double expectedWeight = 0.0;
        double actualWeight = Fit.idealWeight(heightWoman, WOMAN_OFFSET);
        assertThat(actualWeight).isEqualTo(expectedWeight);
    }
}
