package by.training.part2.sorting;

import java.util.Arrays;

/*
Дана последовательность чисел.Реализовать сортировку вставками по возрастанию.
 */
public class Unit1 {
    public static void main(String[] args) {
        int sizeOfArray = Utils.scanner("Введите размер массива");
        int[] array = Utils.fillArrayWithRandom(sizeOfArray);
        Utils.printArray(array);
        insertionSort(array);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Вытаскиваем значение элемента
            int value = arr[i];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int j = i - 1;
            for (; j >= 0; j--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            arr[j + 1] = value;
        }
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(arr));
    }
}
