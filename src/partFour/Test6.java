package partFour;

import java.util.Scanner;

public class Test6 {

    /*
    	Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
     */

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Введите числа...");
        int one = 0;
        int two = 0;
        int three = 0;

        // проверка введеных значений на принадлежность к Integer
        if(reader.hasNextInt()) {
            one = reader.nextInt();
        }else {
            System.out.println("Введен символ либо не целочисленное число...");
        }
        if(reader.hasNextInt()) {
            two = reader.nextInt();
        }else {
            System.out.println("Введен символ либо не целочисленное число...");
        }
        if(reader.hasNextInt()) {
            three = reader.nextInt();
        }else {
            System.out.println("Введен символ либо не целочисленное число...");
        }

        System.out.println("Введенные числа являются простыми... " + checkNumber(one, two, three));
    }

    // Метод проверяет, являются ли данные три числа взаимно простыми
    public static boolean checkNumber(int one, int two, int three) {
        int[] mas = {one, two, three};
        int count = 0;
        for(int j = 0; j < mas.length; j++) {
            int i = mas[j];
            if (i < 10) {
                if(i == 2 || i == 3 || i == 5 || i == 7) {
                    count++;
                }
            }
            if (i >= 10) {
                if (!(i % 2 == 0) && !(i % 3 == 0) && !(i % 5 == 0) && !(i % 7 == 0)) {
                    count++;
                }
            }
        }
        if(count == 3) {
            return true;
        }
        return false;
    }
}
