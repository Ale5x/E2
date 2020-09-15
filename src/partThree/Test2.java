package partThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {

    /*
        Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Образовать из них новую
    последовательность чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный
    массив не использовать.
     */

    public static void main(String[] args) {

            List<Integer> arrayOne = new ArrayList<>();
            List<Integer> arrayTwo = new ArrayList<>();

            int step = 3;       // шаг последовательностей
            initializeSequence(arrayOne, step);
            initializeSequence(arrayTwo, step);
            outputSequence(arrayOne);
            outputSequence(arrayTwo);
            unionSequence(arrayOne, arrayTwo);
            System.out.println("Вывод объединенного массива:");
            outputSequence(arrayOne);
            Collections.sort(arrayOne);
            System.out.println("Вывод объединенного массива после сортировки:");
            outputSequence(arrayOne);
        }

        // Объединение последовательностей
        private static List<Integer> unionSequence(List<Integer> arrayOne, List<Integer> arrayTwo) {
            arrayOne.addAll(arrayTwo);
            return arrayOne;
        }

        // Вывод последовательности
        private static void outputSequence(List<Integer> array) {
            for (Integer number : array) {
                System.out.print(number + " | ");
            }
            System.out.println();
            System.out.println("--------------------");
        }

        // Инициализация последовательности
        public static List<Integer> initializeSequence(List<Integer> array, int step) {
        /*
            Принимаем произвольное значение, которое будет первым значением в последовательности
        и от которого она начнется
         */
        int number = (int) (Math.random() * 10);
            array.add(0, number);
            for (int i = 1; i < 11; i++) {
                array.add(array.get(i - 1) + step);
            }
            return array;
        }
    }

