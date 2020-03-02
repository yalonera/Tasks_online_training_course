package by.training.part1.branching;

/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным.
 */
public class Unit1 {
    public static void main(String[] args) {
        int firstAngle = Utils.scanner("Введите первый угол: ");
        int secondAngle = Utils.scanner("Введите второй угол: ");
        determineTriangleExists(firstAngle, secondAngle);
    }

    // Прямоугольный треугольник имеет один угол в 90 градусов
    //поэтому сумма двух других углов тоже должна быть равна 90 градусов
    private static void determineTriangleExists(int a, int b) {
        int sumAngles = a + b;
        if (sumAngles < 180) {
            System.out.println("Треугольник существует");
            if (a == 90 || b == 90) {
                System.out.println("Треугольник прямоугольный");
            }
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}
