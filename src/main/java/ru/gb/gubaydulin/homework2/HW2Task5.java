package ru.gb.gubaydulin.homework2;

import java.util.Scanner;

public class HW2Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любой год для проверки его високосности");
        int a = scanner.nextInt();
        checkYear(a);
    }

    public static void checkYear(int a) {
        boolean y;
        if ((a % 4 == 0) && (a % 100 != 0)) {
            y = true;
        }
        if (a % 400 == 0) {
            y = true;
        } else {
            y = false;
        }
        if (y) {
            System.out.println("Это високосный год");
        } else {
            System.out.println("Это не високосный год");

        }
    }
}
