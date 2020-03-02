package by.training.part1.cycle;

/*
Напишите программу, где пользователь вводит любое целое положительное число, а программа
суммирует все числа от 1 до введленного пользователем числа
 */
public class Unit1 {
    public static void main(String[] args) {
        int number = Utils.scanner("Введите любое целое положительное число ");
        findSum(number);
    }

    private static void findSum(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
