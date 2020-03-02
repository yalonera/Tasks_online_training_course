package by.training.part2.arraysOfArrays;

/*
В числовой матрице поменять местами два любых столбца, т.е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый.
Номера столбцов вводит пользователь с клавиатуры.
 */
public class Unit3 {
    public static void main(String[] args) {
        int a = Utils.scan("Введите количество строк:");
        int b = Utils.scan("Введите количество столбцов:");
        int[][] arr = Utils.fillMatrixWithRandomInt(a, b);
        Utils.printMatrix(arr);
        int x = Utils.scan("Введите номера первого столбца");
        int y = Utils.scan("Введите номера второго столбца");

        int[] temp = new int[a];
        for (int i = 0; i < a; i++) {
            temp[i] = arr[i][x - 1];
            arr[i][x - 1] = arr[i][x];
            arr[i][x] = temp[i];
        }
        Utils.printMatrix(arr);
    }
}
