package by.training.part2.arraysOfArrays;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */
public class Unit4 {
    public static void main(String[] args) {
        int a = Utils.scan("Введите количество строк:");
        int b = Utils.scan("Введите количество столбцов:");
        int[][] arr = Utils.fillMatrixWithRandomInt(a, b);
        Utils.printMatrix(arr);

        int maxSum = 0;
        int rowWithMaxSum = 0;
        for (int j = 0; j < b; j++) {
            int rowSum = 0;
            System.out.println("Столбец № " + (j + 1));
            for (int i = 0; i < a; i++) {
                rowSum += arr[i][j];
            }
            System.out.println("Сумма элементов столбца = " + rowSum);
            if (rowSum > maxSum) {
                maxSum = rowSum;
                rowWithMaxSum = j;
            }
        }
        System.out.println("Максимальная сумма = " + maxSum + " в столбце № " + (rowWithMaxSum + 1));
    }
}
