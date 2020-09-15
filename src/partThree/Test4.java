package partThree;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

    /*
        Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an. Требуется переставить числа в
    порядке возрастания. Для этого сравниваются два соседних числа ai и ai + 1. Если ai  ai + 1, то делается
    перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
     */

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();

        initializeSequence(array);
        outputSequence(array);
        sortExchange(array);
        System.out.println("Вывод массива в порядке убывания: ");
        outputSequence(array);
    }

    // Инициализация последовательности
    private static List<Integer> initializeSequence(List<Integer> array){

        array.add(0, 7);  //  Произвольно принимаем первое значение в последовательности
        int step = 7;

        // согласно шагу, инициализируем последовательность по 7-й элемент (длинна принята произвольно)
        for(int i = 1; i <= 7; i++){
            array.add(i, (array.get(i - 1) + step));
        }
        return array;
    }

    // Вывод последовательности
    private static void outputSequence(List<Integer> array){
        System.out.println("Вывод последовательности:");
        for (int number : array){
            System.out.print(" | " + number);
        }
        System.out.println();
        System.out.println("--------------------------");
    }

    // Сортировка последовательности
    private static List<Integer> sortExchange(List<Integer> array) {
        int size = 7;
        for(int i = 0; i < 7; i++){
            if(array.get(i) < array.get(i + 1)) {
                int number = array.get(size);
                array.remove(size);
                array.add(i, number);
            }
        }
        return array;
    }
}

