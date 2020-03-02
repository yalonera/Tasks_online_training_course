package by.training.part2.decomposition;

/*
Два простых числа называют "близнецами", если они отличаются друг от друга на 2 ( например 41 и 43)
Найти и напечатать все пары "близнецов" из отрезка [n,2n], где n - заданное натуральное
число больше 2.
 */
public class Unit3 {
    public static void main(String[] args) {
        int n = Utils.scan("Диапазон определяем по числу n, равному :");
        findTwins(n);
    }

    private static void findTwins(int n) {
        if (n > 2) {
            System.out.println("Пары близнецов");
            for (int i = n; i <= 2 * n; i++) {
                System.out.println(i + " " + (i + 2));
                System.out.println("\t");
            }
        }
    }
}
