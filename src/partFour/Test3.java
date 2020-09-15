package partFour;

import java.text.DecimalFormat;

public class Test3 {
    
    /*
        Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");   // урезаем значения до 2х знаков после запятой
        int side = 30; //сторона шестиугольника
        double squareTriangle = squareTriangleMethod(side);  // площадь треугольника

        System.out.println("Площадь треугольника - " + df.format(squareTriangle));
        System.out.println("Площадь шестигольника составляет - " + df.format(squareManyTriangleMethod(squareTriangle))
                + " cм.");

    }

    // Метод вычисления площади треуголика.
    public static double squareTriangleMethod(int side){
        double sideB = (double) (side / 2);
        // Площадь треугольника вычисляется по формуле прямоугольного треугольника
        double sideA = Math.sqrt((Math.pow(side, 2) - Math.pow(sideB, 2)));
        double square = (sideA * sideB) / 2;

        return square;
    }

    // Метод вычисляет площать шестиугольника
    public static double squareManyTriangleMethod(double squareTriangle) {
        // Т.к. шестиугольник состоит из 12 прямоугольников, то =>
        return  squareTriangle * 12;
    }
}

