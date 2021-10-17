package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
        return array;
    }
}
