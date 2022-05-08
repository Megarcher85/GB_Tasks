package ru.gb.gubaydulin.homework3;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        //long len, initialValue;
        makeSimpleArray(6, 13);
    }

    public static int[] makeSimpleArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return (arr);
    }
}

