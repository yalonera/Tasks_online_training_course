package by.training.part2.arraysOfArrays;
/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом
столбце единиц равно номеру столбца
 */

import java.util.Random;

public class Unit9 {
    public static void main(String[] args) {
//      Создаём матрицу случайных размеров m x n
//      Число строк должно быть больше либо равно, чем число столбцов. Иначе - условие не выполнимо.
        int a = generateUniqueRandomInt(10);
        int b = generateUniqueRandomInt(a);
        int[][] arr = new int[a][b];
        for (int j = 0; j < arr[0].length; j++) {
//      Цикл, опредлеющий количесво единиц равным номеру столбца
            for (int k = 0; k <= j; k++) {
                int index = generateUniqueRandomInt(arr.length);
//      Так как повторно вызвынный генератор может несколько раз генерировать одно и то же число,
//      генерируем индекс строки до тех пор, пока не получим число, которое не сгенерировалось ранее
                while (arr[index][j] == 1) {
                    index = generateUniqueRandomInt(arr.length);
                }
                arr[index][j] = 1;
            }
        }
        Utils.printMatrix(arr);
    }

    private static int generateUniqueRandomInt(int range) {
        Random generator = new Random();
        return generator.nextInt(range);
    }
}
