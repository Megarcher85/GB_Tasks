package ru.gb.gubaydulin.homework3;

import java.util.Random;
import java.util.Scanner;

import static java.util.Scanner.*;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(11);
            System.out.printf("%3d", arr[i]);
        }
        System.out.println();
        findMinMaxUnit(arr);
    }

    public static void findMinMaxUnit(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число в массиве: " + max);
        System.out.println("Минимальное число в массиве: " + min);
    }
}

