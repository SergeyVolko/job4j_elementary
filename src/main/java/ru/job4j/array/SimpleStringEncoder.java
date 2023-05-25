package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        char symbol = input.charAt(0);
        StringBuilder result = new StringBuilder(String.valueOf(symbol));
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                symbol = input.charAt(i);
                if (counter > 1) {
                    result.append(counter);
                }
                result.append(symbol);
                counter = 1;
            }
        }
        if (counter > 1) {
            result.append(counter);
        }
        return result.toString();
    }
}
