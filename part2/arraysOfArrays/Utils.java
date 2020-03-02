package by.training.part2.arraysOfArrays;

import java.util.Scanner;

public class Utils {
    static int[][] fillMatrixWithRandomInt(int a, int b) {
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = (int) (Math.random() * 101);
            }
        }
        return arr;
    }

    public static void printMatrix(int[][] arr) {
        System.out.println("Двумерный массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int scan(String message) {
        System.out.println(message);
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
        }
        return scan.nextInt();
    }
}
