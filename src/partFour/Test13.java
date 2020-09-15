package partFour;

import java.util.ArrayList;
import java.util.List;

public class Test13 {

    /*
    	Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
    Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
    Для решения задачи использовать декомпозицию.
     */

    public static void main(String[] args) {

        int interval = 105;
        System.out.println("Интервал чисел до " + interval);

        List<Integer> arrays = new ArrayList<>();

        initializationArray(arrays, interval);
        outputArray(arrays);
        numberTwins(arrays);
    }

    // Инициализация массива простымичислами
    public static List<Integer> initializationArray(List<Integer> arrayNumber, int interval) {
        for (int i = 2; i <= interval; i++) {
            int number = 0;
            for (int h = 2; h <= i; h++) {
                if (i % h == 0) {
                number++;
                 }
            }
            if (number < 2) {
            arrayNumber.add(i);
            }
        }
    return arrayNumber;
}

    // Вывод массива
    public static void outputArray(List<Integer> array) {
    System.out.println("\nВывод простых чисел...");
    for (int i = 0; i < array.size(); i++) {
        System.out.print(" | " + array.get(i));
    }
}

    // Метод находит числа близнецы
    public static void numberTwins(List<Integer> array) {
        System.out.println("\nЧисла близнецы: ");
        for(int i = 1; i < array.size(); i++){
            if(((i + 1) < array.size()) ){
                if(array.get(1 + i) - array.get(i) == 2){
                    System.out.print(array.get(i) + " и " + array.get(i + 1));
                    System.out.println("");
                }
            }
        }
    }
}

