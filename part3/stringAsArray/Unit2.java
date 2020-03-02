package by.training.part3.stringAsArray;

import java.util.Scanner;

/*
Дана строка , подсчитать количество содержащихся в ней цифр
 */
public class Unit2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение с цифрами");
        String input = scan.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                count++;
            }
        }
        System.out.println(count + " цифр в строке");
    }

}
