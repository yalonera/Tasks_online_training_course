package by.training.part4.taskStudent;

import java.util.List;

/*
Создайте класс с именем Student, содержащий поля:
фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
Создайте список из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов,
имеющих оценки, равные только 4 или 5.
 */
public class Main {
    public static void main(String[] args) {
        GroupLogic groupLogic = new GroupLogic();
        Group group = new Group(10);

        group.add(new Student("Vasya", "Petrov", 3, new int[]{3, 3, 5, 5, 4}));
        group.add(new Student("Masha", "Ivanova", 3, new int[]{5, 4, 5, 5, 5}));
        group.add(new Student("Vasya", "Ivanov", 2, new int[]{3, 4, 5, 5, 4}));
        group.add(new Student("Katya", "Petrova", 2, new int[]{4, 3, 5, 5, 5}));
        group.add(new Student("Olya", "Vasnetsova", 3, new int[]{4, 4, 4, 5, 4}));
        group.add(new Student("Sasha", "Kozlov", 2, new int[]{1, 4, 2, 5, 4}));
        group.add(new Student("Sergey", "Kulakov", 3, new int[]{1, 1, 3, 2, 4}));
        group.add(new Student("Lena", "Kulakova", 2, new int[]{3, 2, 1, 1, 3}));
        group.add(new Student("Sasha", "Kuznecova", 3, new int[]{5, 3, 5, 5, 4}));
        group.add(new Student("Zenya", "Petrov", 2, new int[]{3, 3, 5, 5, 4}));

        List<Student> aLevelStudents;
        aLevelStudents = groupLogic.takeALevelStudents(group);
        System.out.println(aLevelStudents);

    }

}
