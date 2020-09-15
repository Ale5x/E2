package partThree;

public class Test6 {

    /*
            Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
        Делается это следующим образом: сравниваются два соседних элемента ai и ai + 1. Если ai <= ai + 1,
        то продвигаются на один элемент вперед.

     */

    public static void main(String[] args) {

        int[] sequence = new int[11];

        initializeSequence(sequence);
        outputSequence(sequence);
        sortShell(sequence);
        outputSequence(sequence);
    }

    // Инициализация последовательности произвольными числами
    public static int[] initializeSequence(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    // Вывод последовательности
    public static void outputSequence(int[] array) {
        System.out.println("Вывод массива...");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }

    // Сортировка Шелла
    public static int[] sortShell(int[] array) {
        System.out.println("\nПроизводим сортировку по алгоритму Шелла...");
        int step = 1;
        int size = array.length;
        while (step < size / 3)
            step = 3 * step + 1;

        while (step >= 1) {
            for (int i = step; i < array.length; i++) {
                for (int j = i; j >= step && array[j] < array[j - step]; j -= step) {
                    int temp = array[j];
                    array[j] = array[j - step];
                    array[j - step] = temp;
                }
            }
            step = step / 3;
        }
        return array;
    }
}
