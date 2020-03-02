package by.training.part2.decomposition;

/*
Выяснить площадь правильного шестиугольника со стороной а, используя метод
вычисления площади треугольника
 */
public class Unit2 {
    public static void main(String[] args) {
        int a = Utils.scan("Сторона правильного шестиугольника");
        System.out.println("Площадь правильного шестиугольника: " + findAreaHexagon(findAreaTriangle(a)));
    }

    private static double findAreaTriangle(int a) {
        double areaOfTriagle = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        return areaOfTriagle;
    }

    private static double findAreaHexagon(double s) {
        double areaOfHexagon = 6 * s;
        return areaOfHexagon;
    }

}
