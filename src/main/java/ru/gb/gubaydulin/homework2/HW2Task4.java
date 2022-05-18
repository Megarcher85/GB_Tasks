package ru.gb.gubaydulin.homework2;

import java.util.Scanner;

public class HW2Task4 {
    public static void main(String[] args) {
        String a = "Hello world!";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько раз написать фразу '" + a + "' ?");
        int b = scanner.nextInt();
        printManyTimes (a, b);
    }
    public static void printManyTimes (String a, int b) {
        for (int i = 0; i < b; i++)
            System.out.println(a);
    }
}
