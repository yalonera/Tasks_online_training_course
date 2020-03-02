package by.training.part2.oneDimensionalArray;

/*
Дана последовательность действительных чисел. Заменить все ее члены, большие данного Z, этим числом.
 */
public class Unit2 {
    public static void main(String[] args) {
        int sizeOfArray = Utils.scanner("Задайте размер массива");
        int[] array = Utils.fillArrayWithRandom(sizeOfArray);
        Utils.printArray(array);
        int z = Utils.scanner("Задайте число Z");
        makeNewArray(array, z);
    }

    private static void makeNewArray(int[] arr, int z) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z) {
                arr[i] = z;
            }
            System.out.print(arr[i] + "\t");
        }
    }
}
