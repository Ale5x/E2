package partOne;

import java.util.ArrayList;
import java.util.List;

public class Test8 {

    /*
    Дана последовательность целых чисел а1, а2, ..., аn.  Образовать  новую  последовательность,
    выбросив из исходной те члены, которые равны min(a1, a2...)
     */
    public static void main(String[] args) {

        int[] array = new int[8];
        List<Integer> arrayMinNumber = new ArrayList<>();

        initializeArray(array);
        searchMin(array, arrayMinNumber);
        System.out.println("\nВывод массива, сформированного из мин чисел...");
        System.out.println(arrayMinNumber.toString());
    }

    // Инициализация и вывод массива произвольными числами
    public static int[] initializeArray(int[] array) {
        System.out.println("Вывод произвольных чисел...");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(" | " + array[i]);
        }
        return array;
    }

    // Поиск минимальных чисел в последовательности, согласно условию...
    public static List<Integer> searchMin(int[] array, List<Integer> arrayMin) {
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) < array.length) {
                arrayMin.add(Math.min(array[i], array[i + 1]));
            }
        }
        return arrayMin;
    }
}
