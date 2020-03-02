package by.training.part2.sorting;

import java.util.Arrays;

/*
Дана последовательность чисел. Реализовать сортировку выбором по убыванию.
 */
public class Unit2 {
    public static void main(String[] args) {
        int sizeOfArray = Utils.scanner("Введите размер массива");
        int[] array = Utils.fillArrayWithRandom(sizeOfArray);
        Utils.printArray(array);
        selectionSort(array);
    }

    private static void selectionSort(int[] arr) {
        /* По очереди будем просматривать все подмножества
        элементов массива (0 - последний, 1-последний, 2-последний,...)
        */
        for (int i = 0; i < arr.length - 1; i++) {
            //Предполагаем, что первый элемент (в каждом
            // подмножестве элементов) является минимальным
            int max = arr[i];
            int max_i = i;
            // В оставшейся части подмножества ищем элемент,
            // который больше предположенного максимума
            for (int j = i + 1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] > max) {
                    max = arr[j];
                    max_i = j;
                }
            }
            //Если нашелся элемент, больший, чем на текущей позиции,
            // меняем их местами
            if (i != max_i) {
                int tmp = arr[i];
                arr[i] = arr[max_i];
                arr[max_i] = tmp;
            }
        }
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(arr));

    }
}
