package ru.gb.gubaydulin.homework3;

public class Task4 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for(int i=0; i<arr.length; i++) {
            for (int j=0;j<arr[i].length; j++) {
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
            }
        System.out.println();

        for(int i=0; i<arr.length; i++) {
            for (int j=0;j<arr[i].length; j++) {
                if ((i==j)||(i==arr.length-j-1)) {
                    arr[i][j] =1;
                }
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
