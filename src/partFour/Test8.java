package partFour;

import java.util.Scanner;

public class Test8 {
    
    /*
        Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива 
    с номерами от k до m.
     */

    public static void main(String[] args) {

        int[] array = new int[12];
        initializeArray(array);
        outputArray(array);
        sumThreeNumbersInArray(array);
        sumThreeNumbersInArrayVariation(array);
        sumThreeFirstNumbersInputUser(array);
    }

    // Инициализация последовательности произвольными значениями
    private static int[] initializeArray(int[] mas) {
        for(int i = 0; i < mas.length; i++){
            int number = (int) (Math.random() * 100);
            if(number%2 == 0){
                mas[i] = (int) (Math.random() * (10 * (1 - 2)));
            }else {
                mas[i] = (int) (Math.random() * 10);
            }
        }
        return mas;
    }

    // Вывод последовательности
    private static void outputArray(int[] mas) {
        System.out.println("Вывод последовательности...");
        for(int i = 0; i < mas.length; i++){
            System.out.print(" | " + mas[i]);
        }
        System.out.println("\n-----------------------------------");
    }

    // Сумма трех последовательных чисел последовательности
    public static void sumThreeNumbersInArray(int[] mas){
        int sum = 0;

        for(int i = 0; i < mas.length; i = i + 3) {
            if(!(i + 3 > mas.length)) {
            sum += mas[i] + mas[i + 1] + mas[i + 2];
            System.out.println("Сумма трех чисел с " + (i + 1) + " по " + (i + 3) + ". Составляет - '" + sum + "'");
            sum = 0;
            }
        }
    }

    // Сумма трёх последовательных чисел последовательности - Вариант
    public static void sumThreeNumbersInArrayVariation(int[] mas) {
        System.out.println("Вариант второй...");
        int sum = 0;
        int countNumber = 0;

        for(int i = 0; i < mas.length; i++) {

            sum += mas[i];
            countNumber++;

            if(countNumber == 3) {
                System.out.println("Сумма трех чисел с " + (i + 1) + " по " + (i + 3) + ". Составляет - '" + sum + "'");
                sum = 0;
                countNumber = 0;
            }
        }
    }

    // Сумма трёх последовательных чисел последовательности, пользователь вводит значение, с которого нужно посчитать
    private static void sumThreeFirstNumbersInputUser(int[] mas) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите с какого элемента  считать сумму 3-х последовательных чисел: ");
        int number = 0;
        if(scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Введено не число...");
        }

        if(!(number >= mas.length)) {
            for (int i = number - 1; i < number + 2; i++) {
                sum += mas[i];
            }
        }else {
            System.out.println("Данное число превышает размер последовательности...");
        }

        System.out.println("\nСумма трех последовательных чисел, начиная с числа под индексом " + number +
                " . Равняется: '" + sum + "'");
    }
}

