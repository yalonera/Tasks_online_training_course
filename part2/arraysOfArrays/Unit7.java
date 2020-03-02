package by.training.part2.arraysOfArrays;

/*
Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class Unit7 {
    public static void main(String[] args) {
        int[][] arr = Utils.fillMatrixWithRandomInt(4, 4);
        Utils.printMatrix(arr);
        System.out.println("Отсортированный по возрастанию значений в строках");
        Utils.printMatrix(sortLinesAscending(arr));
        System.out.println("Отсортированный по убыванию значений в строках");
        Utils.printMatrix(sortLinesDescending(arr));
    }

    private static int[][] sortLinesAscending(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int t = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = t;
                    }
                }
            }
        }
        return arr;
    }

    private static int[][] sortLinesDescending(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                    if (arr[i][k] < arr[i][k + 1]) {
                        int t = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = t;
                    }
                }
            }
        }
        return arr;
    }
}
