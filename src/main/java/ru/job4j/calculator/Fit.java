package ru.job4j.calculator;

public class Fit {

    private static final int MAN_OFFSET = 100;
    private static final int WOMAN_OFFSET = 110;

    public static double idealWeight(short height, int offset) {
        return (height - offset) * 1.15;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;

        double man = idealWeight(heightMan, MAN_OFFSET);
        System.out.println("Man 187 is " + man);

        double woman = idealWeight(heightWoman, WOMAN_OFFSET);
        System.out.println("Woman 170 is " + woman);
    }
}
