package by.training.part1.liner_program;

/*
Вычислить значение выражения по формуле
 */
public class Unit3 {
    public static void main(String[] args) {
        int x = Utils.scanner("Введите х");
        int y = Utils.scanner("Введите y");
        System.out.println("Значение выражения: " + findValueOfEquation(x, y));
    }

    private static double findValueOfEquation(int x, int y) {
        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y));
        return z;
    }
}
