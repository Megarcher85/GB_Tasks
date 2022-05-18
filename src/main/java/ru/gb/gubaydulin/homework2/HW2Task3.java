package ru.gb.gubaydulin.homework2;

import java.util.Scanner;

public class HW2Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        int a = scanner.nextInt();
        checkPozitive2 (a);
    }

    public static void checkPozitive2 (int a) {
        if ( a >= 0 ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    }

