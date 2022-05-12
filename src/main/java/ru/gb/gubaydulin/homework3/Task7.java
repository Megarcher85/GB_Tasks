package ru.gb.gubaydulin.homework3;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(2);
            System.out.printf("%3d", arr[i]);
        }
        System.out.println();
        if (checkBalance(arr)) {
            System.out.println("Середина строки есть!");
        }
        else {
            System.out.println("Середины строки нет!");
        }
    }

    private static boolean checkBalance(int[] arr) {
        int stringSumm = 0;
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            stringSumm += arr[i];
        }
        if (stringSumm % 2 == 1)
            return false;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
            if (summ < stringSumm / 2)
                continue;
            else if (summ == stringSumm / 2)
                return true;
        }
        return false;}
}