package partOne;

public class Test7 {

    /*
    Даны действительные числа  Найти max(а1 + а2, а2 + аn, ...)
     */
    public static void main(String[] args) {

        int[] array = new int[8];

        initializeArray(array);
        searchMax(array);
    }

    // Инициализация и вывод массива произвольными числами
    public static int[] initializeArray(int[] array) {
        System.out.println("Вывод произвольных чисел...");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(" | " + array[i]);
        }
        return array;
    }

    // Поиск максимального числа согласно условию
    public static void searchMax(int[] array) {
            int maxNumber = 0;
            for (int i = 0; i < array.length; i++) {
                if ((i + 2) < array.length) {
                    maxNumber = Math.max((array[i] + (array[i + 1])), ((array[i + 1]) + array[i + 2]));
                }
            }
            System.out.println("\nМаксимальное число по условию: max(a1 + a2, a2 + an-1) - " + maxNumber);
    }
}
