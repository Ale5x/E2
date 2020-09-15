package partOne;

public class Test5 {

    /*
    Даны целые числа а1,а2 ,..., аn. Вывести на печать только те числа, для которых аi> i.
     */

    public static void main(String[] args) {
        int[] Array = new int[10];
        initializeArray(Array);
        outputNumberMoreIndex(Array);
    }

    // Инициализация и вывод массива произвольными числами
    public static int[] initializeArray(int[] array) {
        System.out.println("Вывод последовательности...");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(" | " + array[i]);
        }
        return array;
    }

    // Вывод тех чисел, которые больше своего индекса
    public static void outputNumberMoreIndex(int[] array) {
        System.out.println("\n Вывод последовательности, в которых числа больше индекса");
        for(int i = 0; i < array.length; i++){
            if(Integer.valueOf(array[i]) > i){
                System.out.println("Число больше индекса в mas[" + i +"]." + " Число - " + array[i] + ". Индекс - " + i);
            }
        }
    }
}
