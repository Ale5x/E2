package partThree;

public class Test3 {

    /*
        Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an. Требуется переставить
    элементы так, чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого,
    выбирается наибольший элемент и ставится на первое место, а первый - на место наибольшего.
    Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
     */

    public static void main(String[] args) {

        int[] array = new int[10];

        initializeArray(array);
        outputArray(array);
        System.out.println("После сортировки...");
        sortSelection(array);
        outputArray(array);
    }

    // Инициализация массива произвольными числами
    public static int[] initializeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    // Вывод массива
    public static void outputArray(int[] array) {
        System.out.println("Вывод массива...");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println("\n----------------------------");
    }

    // Сортировка выбором
    public static int[] sortSelection(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int number = array[i];
                array[i] = array[min_i];
                array[min_i] = number;
            }
        }
        return array;
    }
}