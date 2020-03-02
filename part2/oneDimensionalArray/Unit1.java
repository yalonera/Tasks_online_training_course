package by.training.part2.oneDimensionalArray;

/*
В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны заданному числу К.
 */
public class Unit1 {
    public static void main(String[] args) {
        int sizwOfArray = Utils.scanner("Введите размер массива");
        int[] array = Utils.fillArrayWithRandom(sizwOfArray);
        Utils.printArray(array);
        int k = Utils.scanner("Введите число K, которым проверяем кратность: ");
        System.out.println("Сумма элементов: " + findSum(array, k));

    }

    private static int findSum(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
