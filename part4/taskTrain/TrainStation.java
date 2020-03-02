package by.training.part4.taskTrain;
/*
Создайте класс Train, содержащий поля:
название пункта назначения, номер поезда, время отправления.
Создайте данные в List из пяти элементов типа Train, добавьте возможность сортировки элементов по номерам поездов.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TrainStation {
    public static void main(String[] args) {

        List<Train> trainList = Arrays.asList(
                new Train("Киев", 4, 10.23),
                new Train("Киев", 3, 11.00),
                new Train("Москва", 1, 9.30),
                new Train("Ямайка", 2, 8.28),
                new Train("Вильнюс", 5, 12.45)
        );

        Collections.sort(trainList);
        System.out.println(trainList);
    }
}
