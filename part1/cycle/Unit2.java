package by.training.part1.cycle;

/*
Найти сумму квадратов первых ста чисел
 */
public class Unit2 {
    public static void main(String[] args) {
        System.out.print("Сумма квадратов первых ста чисел: " + findSum());
    }

    private static int findSum() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }
}
