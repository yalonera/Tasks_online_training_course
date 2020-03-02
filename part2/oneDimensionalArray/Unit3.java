package by.training.part2.oneDimensionalArray;

/*
Задана последовательность вещественных чисел. Вычислить сумму тех чисел, порядковый номер которых
являются простыми числами
 */
public class Unit3 {
    public static void main(String[] args) {
        int sizeOfArray = Utils.scanner("Задайте размер массива");
        int[] array = Utils.fillArrayWithRandom(sizeOfArray);
        Utils.printArray(array);
        System.out.println("Порядковые номера: ");
        findSum(array);
    }

    private static boolean isPrime(int d) {
        if (d == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(d) + 1;
        for (int i = 2; i <= sqrt; i++) {
            if (d % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void findSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(i)) {
                sum += array[i];
                System.out.print(i + "\t");
            }

        }
        System.out.println();
        System.out.println("Сумма: " + sum);
    }

}
