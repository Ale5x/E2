package partOne;

public class Test9 {

    /*
    В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
    Если таких чисел несколько, то определить наименьшее из них.
     */

    public static void main(String[] args) {

        int[] array = new int[15];

        initializeArray(array);
        searchCountDuplicate(array);
    }

    // Инициализация и вывод массива произвольными числами
    public static int[] initializeArray(int[] array) {
        System.out.println("Вывод произвольных чисел...");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(" | " + array[i]);
        }
        System.out.println();
        return array;
    }

    // Поиск чисел, которые больше всего встречаются в последовательности
    public static void searchCountDuplicate(int[] array) {
        int count = 0;
        int number = 0;
        int countSearch = 0;
        int numberSearch = 0;

        for(int i = 0; i < array.length; i++) {
            count = 0;
            for(int j = 0; j < array.length; j++) {

                if(array[i] == array[j]) {
                    count++;
                    number = array[i];
                }

                if(count > countSearch) {
                    countSearch = count;
                    numberSearch = number;
                }
            }
        }
        System.out.println("Наиболее часто встпечающеся число - " + numberSearch + ". Встречается - " + countSearch
                + " раз...");
    }
}
