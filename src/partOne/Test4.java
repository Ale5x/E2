package partOne;

public class Test4 {

    /*
    Даны действительные числа а1,а2,..., аn. Поменять местами наибольший и наименьший элементы
     */

    public static void main(String[] args) {

        int[] array = new int[15];
        array[0] = 1;
        initializeArray(array);
        replaceMaxOnMin(array);
    }

    // Инициализация и вывод последовательности
    public static int[] initializeArray(int[] array) {
        int step = 3;
        System.out.println("Вывод последовательности");
        System.out.print(array[0] + " | ");
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + step;
            System.out.print(array[i] + " | ");
        }
        System.out.println("\nНаименьший элемент = " + array[0]);
        System.out.println("Наибольший элемент = " + array[array.length - 1]);
        return array;
    }

    // Замена в последовательности максимального на минимальный элемент
    // и вывод последовательности после замены
    public static void replaceMaxOnMin(int[] array) {

        int numberNull = array[0];
        array[0] = array[14];
        array[14] = numberNull;

        System.out.println("Вывод последовательности после замены...");

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println("\nНаименьший элемент = " + array[0]);
        System.out.println("Наибольший элемент = " + array[array.length - 1]);
    }
}
