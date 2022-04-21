package ru.gb.gubaydulin.homework2;

import java.util.Scanner;

public class HW2Task1 {

    public static void main(String[] args) {
        check();
    }

    public static void check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        if ((a + b) >= 10 && (a + b) <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
