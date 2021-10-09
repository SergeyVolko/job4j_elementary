package ru.job4j.chapter1.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}
