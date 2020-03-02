package by.training.part2.decomposition;

import java.util.Scanner;

public class Utils {
    public static int scan(String message) {
        System.out.println(message);
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
        }
        return scan.nextInt();
    }
}
