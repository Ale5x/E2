package partOne;

public class Test2 {

    /*
    Дана последовательность действительных чисел а1,а2 ,..., ап. Заменить все ее члены, большие данного Z,
    этим числом. Подсчитать количество замен
     */

    public static void main(String[] args) {

        int[] array = new int[10];
        int change = 7;

        initialize(array);
        replaceMas(array, change);
    }

    // Инициализация и вывод массива числами
    public static int[] initialize(int[] array) {
        int step = 2;

        System.out.println("Вывод последовательности...");
        array[0] = 0;
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + step;
            System.out.print(" | " + array[i]);
        }
        return array;
    }

    // Замена чисел в массиве, которые больше числа n и подсчёт количества замен
    public static void replaceMas(int[] array, int change) {

        int count = 0;

        System.out.println("\nЗамена чисел в последовательности, которые больше числа " + change);
        System.out.println("Вывод последовательности после замены");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > change) {
                array[i] = change;
                count++;
            }
            System.out.print(" | " + array[i]);
        }
        System.out.println("\nКоличество замен - " + count);
    }
}
