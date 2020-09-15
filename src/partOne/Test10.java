package partOne;

import java.util.Arrays;

public class Test10 {

    /*
    Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
    (освободившиеся элементы заполнить нулями).Примечание. Дополнительный массив не использовать
     */

    public static void main(String[] args) {

        int[] array = new int[100];
        initializeArray(array);
        compressionArray(array);
        compressionArrayVariation(array);

    }

    // Инициализация и вывод массива произвольными числами
    private static int[] initializeArray(int[] array) {
        System.out.println("Вывод массива...");
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " | ");
        }
        return array;
    }

    // Сжатие массива
    private static void compressionArray(int[] array) {
        System.out.println("\nЗамена каждого второго элемента '0'...");
        for(int i = 0; i < array.length; i++){
            array[i] = i;
            if(i % 2 == 0){
                array[i] = 0;
            }
            System.out.print(array[i] + " | ");
        }
    }

    //Сжатие массива, вариант второй
    private static void compressionArrayVariation(int[] array) {
        System.out.println("\nЗамена каждого второго элемента '0' - Вариант 2...");
        for(int i = 1; i < array.length; i++){
            if(i % 2 == 0){
                array[i] = 0;
            }
        }

        for (int j = 0; j < array.length; j++) {
            // Вытаскиваем значение элемента
            int value = array[j];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = j - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[array.length - i - 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
