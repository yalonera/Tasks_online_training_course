package by.training.part3.stringAsArray;

import java.util.Scanner;

/*
В строке найти количество слов
 */
public class Unit1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String input = scan.nextLine();
        int count = 0;

        if (input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("Вы ввели " + count + " слов");

    }
}
