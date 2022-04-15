package ru.gb.gubaydulin;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("*********************************");
        checkSumSign();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 7, b = -9;
        if ((a + b) >=0) {
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }
}