package by.training.part2.sorting;

/*
Дан массив действительных чисел. Требуется упорядочить его
по возрастанию сортировкой Шелла
 */
public class Unit3 {
    public static void main(String[] args) {
        int sizeOfArray = Utils.scanner("Введите размер массива");
        int[] array = Utils.fillArrayWithRandom(sizeOfArray);
        Utils.printArray(array);
        System.out.println("Отсортированный массив");
        shellSort(array);

    }

    private static void shellSort(int[] arr) {
        //Высчитываем промежуток между проверяемыми элементами
        int gap = arr.length / 2;
        //Пока разница между элементами есть
        while (gap > 0) {
            for (int i = 1; i < arr.length - gap; i++) {
                int j = i;
                while (j > 0 && arr[j] > arr[j + gap]) {
                    int ch = arr[j];
                    arr[j] = arr[j + gap];
                    arr[j + gap] = ch;
                    j--;
                }
            }
            gap = gap / 2;
        }
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
