package partFour;

import java.util.Scanner;

public class Test4 {

    /*
        На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между
    какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
     */

    public static void main(String[] args) {

        int[] arrayOfPoints = new int[sizeArray()];

        initializationArray(arrayOfPoints);
        outputArray(arrayOfPoints);
        MaxDistancePoints(arrayOfPoints);
        MaxDistancePointsVariationTwo(arrayOfPoints);
    }

    // Определяем количество точек
    public static int sizeArray() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите количество точек на плоскости: ");
        int size = 0;
        if(reader.hasNextInt()) {
            size = reader.nextInt();
        }else {
            System.out.println("Введено не число...");
        }
        return size;
    }

    // Инициализируем массив: Присваиваем значения (координаты) точек на прямой произвольными числами
    public static int[] initializationArray(int[] mas){
        for(int i = 0; i < mas.length; i++){
            int number = (int) (Math.random() * 10);
            if(number%2 == 0){
                mas[i] = (int) (Math.random() * 10);
            } else {
                mas[i] = (int) (Math.random() * 10 * (1 - 2));
            }
        }
        return mas;
    }

    // Вывод значений точек на прямой
    public static void outputArray(int[] mas){
        for(int i = 0; i < mas.length; i++){
            System.out.print(" | " + mas[i]);
        }

        System.out.println("\n----------------------------");
    }

    // Поиск максимального растояния между точками
    public static void MaxDistancePoints(int[] mas){
        int pointOne = 0;
        int pointTwo = 0;
        int distance = 0;
        int distanceMax = 0;

        for(int i = 0; i < mas.length; i++){
            for(int t = 0; t < mas.length; t++){

                distance = mas[i] - mas[t];
                if(distance > distanceMax){
                    distanceMax = distance;
                    pointOne = i;
                    pointTwo = t;
                }
            }
        }
        System.out.println("Максимальное расстояние между точками " + (pointOne + 1) + " и " + (pointTwo + 1)
                + " составляет: " + distanceMax);
    }

    // Второй способ реализации
    public static void MaxDistancePointsVariationTwo(int[] mas){
        System.out.println("Второй способ...");
        int pointOne = 0;
        int pointTwo = 0;
        int distanceMax;
        int numberMax = 0;
        int numberMin = 0;

        for(int i = 0; i < mas.length; i++){
            if(mas[i] > numberMax){
                numberMax = mas[i];
                pointOne = i;
            }
            if(mas[i] < numberMin){
                numberMin = mas[i];
                pointTwo = i;
            }
        }
        distanceMax = numberMax - numberMin;
        System.out.println("Максимальное расстояние между точками " + (pointOne + 1) + " и " + (pointTwo + 1)
                + " составляет: " + distanceMax);
    }
}

