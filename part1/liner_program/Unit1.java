package by.training.part1.liner_program;

/*
 Найти целое значение функции: z = ((a-3)*b/2)+c.
 */
public class Unit1 {
    public static void main(String[] args) {
        int a = Utils.scanner("Введите число а");
        int b = Utils.scanner("Введите число b");
        int c = Utils.scanner("Введите число с");
        System.out.println("Значение функции: " + findValueOfEquation(a, b, c));
    }

    private static int findValueOfEquation(int a, int b, int c) {
        int z = ((a - 3) * b / 2) + c;
        return z;
    }
}
