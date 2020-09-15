package partThree;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    
    /*
        Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
        Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого, 
        при этом не используя дополнительный массив.
     */

    public static void main(String[] args) {

        List<Integer> arrayOne = new ArrayList<>();
        arrayOne.add(0);
        List<Integer> arrayTwo = new ArrayList<>();
        arrayTwo.add(1);

        int stepOne = 11;   // шаг для первой последовательности
        int stepTwo = 1;    // шаг для второй последовательности

        initializeSequence(arrayOne, stepOne);
        initializeSequence(arrayTwo, stepTwo);
        System.out.print("Последовательность №1...");
        sequenceOutput(arrayOne);
        System.out.print("\nПоследовательность №2... ");
        sequenceOutput(arrayTwo);
        arrayOne = unionList(arrayOne, arrayTwo);
        System.out.println("\nОбъединение 2х последовательностей...");
        sequenceOutput(arrayOne);
    }

    // Инициализация последовательности
    public static List<Integer> initializeSequence(List<Integer> array, int step) {
        for(int i = 1; i < 8; i++) {
            array.add(array.get(i - 1) + step);
        }
        return array;
    }

    // Вывод последовательности
    public static void sequenceOutput(List<Integer> array) {
        System.out.println("\nВывод последовательности...");
        System.out.print(array.toString());
    }

    // Объединение последовательностей
    public static List<Integer> unionList(List<Integer> arrayOne, List<Integer> arrayTwo) {
        for (int i = 0; i < arrayOne.size(); i++) {
            if(i < arrayTwo.size() && arrayTwo.get(i) > arrayOne.get(i) && arrayTwo.get(i) < arrayOne.get(i + 1)) {
                arrayOne.addAll(i + 1, arrayTwo);
                break;
            }
        }
        return arrayOne;
    }
}
