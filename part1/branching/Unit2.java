package by.training.part1.branching;

/*
Вычислить значение функции
 */
public class Unit2 {
    public static void main(String[] args) {
        int x = Utils.scanner("Введите число: ");
        System.out.print("Значение функции : " + findValueOfEquation(x));

    }

    private static double findValueOfEquation(int x) {
        double function = 1;
        if (x <= 3) {
            function = Math.pow(x, 2) - 3 * x + 9;
        } else if (x > 3) {
            function = 1 / (Math.pow(x, 3) + 6);
        }
        return function;
    }
}
