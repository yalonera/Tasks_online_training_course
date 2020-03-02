package by.training.part1.liner_program;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах
Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSс
 */
public class Unit4 {
    public static void main(String[] args) {
        int time = Utils.scanner("Введите число, эквивалентное количеству секунд");
        System.out.println(findHours(time) + " ч " + findMinutes(time) + " мин " + findSeconds(time) + " c");
    }

    private static int findHours(int time) {
        int hour = time / 3600;
        return hour;
    }

    private static int findMinutes(int time) {
        int minut = (time % 3600) / 60;
        return minut;
    }

    private static int findSeconds(int time) {
        int second = (time % 3600) % 60;
        return second;
    }
}
