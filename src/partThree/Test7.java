package partThree;

import java.util.ArrayList;
import java.util.List;

public class Test7 {

    /*
        Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= .. <= an и
      b1 <= b2 <= ... <= bm. Требуется указать те места, на которые нужно вставлять элементы
      последовательности b1 <= b2 <= ... <= bm в первую последовательность так, чтобы новая
      последовательность оставалась возрастающей.
     */

    public static void main(String[] args) {

        List<Integer> sequenceOne = new ArrayList<>();
        sequenceOne.add(0);
        List<Integer> sequenceTwo = new ArrayList<>();
        sequenceTwo.add(1);

        // Шаг для первой последовательности
        int stepOne = 7;
        //Шаг для второй последовательности
        int stepTwo = 8;

        initializeSequence(sequenceOne, stepOne);
        initializeSequence(sequenceTwo, stepTwo);
        System.out.print("Последовательность №1...");
        outputSequence(sequenceOne);
        System.out.print("\nПоследовательность №2... ");
        outputSequence(sequenceTwo);
        newSequence(sequenceOne, sequenceTwo);
    }

    // Инициализация последовательности
    public static List<Integer> initializeSequence(List<Integer> array, int step) {
        for (int i = 1; i < 8; i++) {
            array.add(array.get(i - 1) + step);
        }
        return array;
    }

    // Вывод последовательности
    public static void outputSequence(List<Integer> array) {
        System.out.println("\nВывод Последовательности...");
        System.out.print(array.toString());
    }

    /*
        Новая последовательность, в которой указаны места, куда необходимо вставлять элементы, чтобы
     получилась возоастающая поледовательность
     */
    public static void newSequence(List<Integer> arrayOne, List<Integer> arrayTwo) {
        for(int i = 0; i < arrayOne.size(); i++) {
            if(i < arrayTwo.size() && arrayTwo.get(i) > arrayOne.get(i)) {
                if((i + 1) < arrayOne.size()) {
                    System.out.println("\nНеобходимо вставить элемент \"" + arrayTwo.get(i) + "\"" +
                            " между элементами последовательности \"arrayOne\" " + arrayOne.get(i) + " и "
                            + arrayOne.get(i + 1));
                }else if((i + 1) > arrayOne.size()) {
                    System.out.println("\nНеобходимо вставить элемент после последовательности массива \"arrayOne\" "
                            + arrayOne.get(i));
                }
            }
        }
    }
}
