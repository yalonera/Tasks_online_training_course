package by.training.part1.liner_program;

/*
Вычислить значение выражения по формуле
 */
public class Unit2 {
    public static void main(String[] args) {
        int a = Utils.scanner("Введите значение а");
        int b = Utils.scanner("Введите значение b");
        int c = Utils.scanner("Введите значение c");
        System.out.println("Значение выражения: " + findValueOfEquation(a, b, c));
    }

    private static double findValueOfEquation(int a, int b, int c) {
        double d = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / 2 * a) - (Math.pow(a, 3) * c + Math.pow(b, -2));
        return d;
    }
}
