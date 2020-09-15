package partOne;

public class Test6 {

    /*
    Задана последовательность N вещественных чисел. Вычислить сумму чисел,
    порядковые номера которых являются простыми числами
     */

    public static void main(String[] args) {

        int[] array = new int[1000];

        initialize(array);
        sumNumberMasIfTheyIndexPrime(array);
    }

    // Инициализация и вывод массива произвольными числами
    public static int[] initialize(int[] array) {
        System.out.println("Вывод последовательности...");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " | ");
        }
        return array;
    }

    // Вычисление суммы чисел, индексы которых являются простыми числами
    public static void sumNumberMasIfTheyIndexPrime(int[] array) {
        int sumNumber = 0;
        System.out.println("\nИндексы, которые являются простыми числами...");
        for(int i = 0; i < array.length; i++) {
            if (i < 10) {
                if(i == 2 || i == 3 || i == 5 || i == 7) {
                        sumNumber += array[i - 1];
                        System.out.print(" | " + i);
                }
            }
            if (i >= 10) {
                if (!(i % 2 == 0) && !(i % 3 == 0) && !(i % 5 == 0) && !(i % 7 == 0)) {
                    sumNumber += array[i - 1];
                    System.out.print(" | " + i);
                }
            }
        }
        System.out.println("\nСумма чисел массива mas, индексы которого являются простыми числами: " + sumNumber);
    }
}
