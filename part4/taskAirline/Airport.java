package by.training.part4.taskAirline;

import javafx.scene.input.DataFormat;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Создать класс Airline, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Airport {
    public static void main(String[] args) {
        List<Airline> airlines = Arrays.asList(
                new Airline("Paris", 24, "passenger", LocalDateTime.of(2020, 6, 2, 11, 30)),
                new Airline("Milan", 34, "passenger", LocalDateTime.of(2020, 9, 29, 14, 30)),
                new Airline("Milan", 32, "passenger", LocalDateTime.of(2020, 9, 29, 19, 40)),
                new Airline("Moscow", 7, "passenger", LocalDateTime.of(2020, 9, 5, 13, 0))
        );

        Collections.sort(airlines);
        System.out.println(airlines + "\t");
    }
}
