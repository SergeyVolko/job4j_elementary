package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int temp, index, min;
        for (int i = 0; i < data.length; i++) {
            min = MinDiapason.findMin(data, i, data.length - 1);
            index = FindLoop.indexOf(data, min, i, data.length - 1);
            swap(data, i, index);
        }
        return data;
    }

    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }
}
