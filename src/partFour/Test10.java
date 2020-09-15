package partFour;

import java.util.ArrayList;
import java.util.List;

public class Test10 {

    /*
       Дано натуральное число N. Написать метод(методы) для формирования массива,
    элементами которого являются цифры числа N.
     */

    public static void main(String[] args) {

        int[] array = new int[10];

        int number = (int) (Math.random() * 1000);    //  создаем случайное число
        System.out.println("Число - " + number);

        createArray(array, number);
        outputArray(array, number);
    }

    // Создание массива состоящего из произвольных чисел
    public static int[] createArray(int[] array, int number) {

        String stringNumber = Integer.toString(number);
        char[] arrayNumber = stringNumber.toCharArray();

        List<Integer> arrayNumbers = new ArrayList<>();
        for (int i = 0; i < arrayNumber.length; i++) {
            int c = Character.getNumericValue(arrayNumber[i]);
            arrayNumbers.add(c);
        }

        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 10);
            if (random < 4) {
                array[i] = arrayNumbers.get(0);
            } else if (random >= 4 & random < 8) {
                array[i] = arrayNumbers.get(arrayNumbers.size() - 1);
            } else if (random >= 8 & random <= 10) {
                array[i] = arrayNumbers.get(arrayNumbers.size() - 2);
            }
        }
        return array;
    }

    // Вывод массива
    public static void outputArray(int[] array, int number) {

        System.out.println("Вывод массива. Массив составлен из цифр числа " + number);
        for (int i = 0; i < array.length; i++) {
            System.out.print(" | " + array[i]);
        }
    }
}
