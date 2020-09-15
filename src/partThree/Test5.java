package partThree;

import java.util.Scanner;

public class Test5 {

    /*
        Сортировка вставками. Дана последовательность чисел a1, a2, ..., an. Требуется переставить числа
   в порядке возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность,
   т. е. a1 <= a2 <= ... <= an. Берется следующее число ai + 1 и вставляется в последовательность так, чтобы новая
   последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n не
   будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью 
   двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
     */
    
    public static void main(String[] args) {

        int[] sequence = new int[11];
        Scanner reader = new Scanner(System.in);

        initializeSequence(sequence);
        outputSequence(sequence);
        sortInsertion(sequence);
        outputSequence(sequence);

        int numberSearch, first, last;
        System.out.println("\nВведите элемент для бинарного поиска: ");
        if(reader.hasNextInt()) {
            numberSearch = reader.nextInt();
            first = 0;
            last = sequence.length - 1;
            binarySearch(sequence, first, last, numberSearch);
        }else System.out.println("Введено не число");
    }

    // Инициализация последовательности произвольными числами
    public static int[] initializeSequence(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    // Вывод последовательности
    public static void outputSequence(int[] array) {
        System.out.println("Вывод массива...");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }

    // Сортировка вставками
    public static int[] sortInsertion(int[] array) {
        System.out.println("\nСортировка массива методом: \"Сортировка вставками\"");
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        return array;
    }

    // Бинарный поиск в последовательности
    public static void binarySearch(int[] array, int first, int last, int numberSearch) {
        int position;
        int comparisonCount = 1;    // для подсчета количества сравнений

        // для начала найдем индекс среднего элемента массива
        position = (first + last) / 2;

        while ((array[position] != numberSearch) && (first <= last)) {
            comparisonCount++;
            if (array[position] > numberSearch) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(numberSearch + " является " + ++position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                    " сравнений");
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + comparisonCount + " сравнений");
        }
    }
}
