package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int def = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (def >= coins[i]) {
                rsl[size++] = coins[i];
                def -= coins[i];
            }
            if (def == 0) {
                break;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
