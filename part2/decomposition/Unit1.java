package by.training.part2.decomposition;

/*
Написать методы(метод) для нахождения наибольшего общего делителя и наиментшего общего
кратного двух натуральных чисел
 */
public class Unit1 {
    public static void main(String[] args) {
        int firstNumber = Utils.scan("Введите первое число");
        int secondNumber = Utils.scan("Введите второе число");
        System.out.println("НОД " + findNOD(firstNumber, secondNumber));
        System.out.println("НОК " + findNOK(firstNumber, secondNumber));
    }

    private static int findNOD(int a, int b) {
        //НОД - исло, которое делит без остатка два числа
        // и делится само без остатка на любой другой делитель данных двух чисел.
        int nod = 1;
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }

    private static int findNOK(int a, int b) {
        int nok = (a * b) / (findNOD(a, b));
        return nok;
    }
}
