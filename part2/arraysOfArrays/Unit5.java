package by.training.part2.arraysOfArrays;

/*
Найти положительные элементы главной диагонали квадратной матрицы
 */
public class Unit5 {
    public static void main(String[] args) {
        int a = Utils.scan("Введите размер матрицы");
        int[][] arr = fillSquareMatrixWithRandomInt(a);
        Utils.printMatrix(arr);

        for (int i = 0; i < a; i++) {
            if (arr[i][i] >= 0) {
                System.out.println("Найден положительный элемент на главной диагонали " + arr[i][i]);
            }
        }
    }

    private static int[][] fillSquareMatrixWithRandomInt(int a) {
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = (int) ((Math.random() * 200) - 100);
            }
        }
        return arr;
    }
}
