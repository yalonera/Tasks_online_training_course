package by.training.part2.arraysOfArrays;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */
public class Unit2 {
    public static void main(String[] args) {
        int matrixSize = Utils.scan("Введите чётное число");
        int[][] arr = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            if (i < matrixSize / 2) {
                for (int j = i; j < matrixSize - i; j++) {
                    arr[i][j] = 1;
                }
            } else {
                for (int j = matrixSize - 1 - i; j <= i; j++) {
                    arr[i][j] = 1;
                }
            }
        }
        Utils.printMatrix(arr);
    }
}
