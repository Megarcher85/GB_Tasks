package ru.gb.gubaydulin;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("2.");
        printThreeWords();
        System.out.println("*********************************");
        System.out.print("3. ");
        checkSumSign();
        System.out.println("*********************************");
        System.out.print("4. ");
        printColor();
        System.out.println("*********************************");
        System.out.print("5. ");
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 7, b = -9;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }
        if (value > 100) {
            System.out.println("Зелёный");
        }

    }
    public static void compareNumbers() {
        int a = 10, b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
            }
}