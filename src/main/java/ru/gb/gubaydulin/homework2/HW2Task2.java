package ru.gb.gubaydulin.homework2;

import java.util.Scanner;

public class HW2Task2 {
    public static void main(String[] args) {
        System.out.println ("Введите любое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        checkPozitive(a);
    }
    public static void checkPozitive(int a) {

        if ( a >=0 ){
            System.out.println("Число положительное");
        } else{
            System.out.println("Число отрицательное");
        }
    }
}
