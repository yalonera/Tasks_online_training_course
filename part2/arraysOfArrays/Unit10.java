package by.training.part2.arraysOfArrays;

/*
Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Unit10 {
    public static void main(String[] args) {
        int matrixSize = Utils.scan("Введите размер матрицы");
        int[][] arr = Utils.fillMatrixWithRandomInt(matrixSize, matrixSize);
        Utils.printMatrix(arr);

        int max = findMaxElement(arr);
        System.out.println("Максимальное число = " + max);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    arr[i][j] = max;
                }
            }
        }
        Utils.printMatrix(arr);
    }

    private static int findMaxElement(int[][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
