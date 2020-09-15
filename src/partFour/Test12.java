package partFour;

public class Test12 {

    /*
        Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами
    которого являются числа, сумма цифр которых равна К и которые не большее N
     */
    public static void main(String[] args) {

        int numberOne = 7;
        int numberNotMax = 72;

        int[] array = new int[8];

        initializationArray(array, numberOne, numberNotMax);
        System.out.println("Сумма цифр числа в массиве должно соответствовать числу \"" + numberOne + "\" и не должно " +
                "превышать значение \"" + numberNotMax + "\"");
        outputArray(array);
    }

    // Инициализация массива согласно условию задания
    public static int[] initializationArray(int[] array, int number, int numberNotMax) {
        int sumRandom = 0;
        boolean isNext;
        for(int i = 0; i < array.length; i++) {
            isNext = true;
            while (isNext) {
                int numberRandom = (int) (Math.random() * 100);
                String numberRandomLine = String.valueOf(numberRandom);

                char[] charsRandom = numberRandomLine.toCharArray();
                for (int j = 0; j < charsRandom.length; j++) {
                    sumRandom += Character.getNumericValue(charsRandom[j]);
                }
                if (sumRandom == number) {
                    if (numberNotMax > numberRandom) {
                        array[i] = numberRandom;
                        isNext = false;
                    }
                }
                sumRandom = 0;
            }
        }
        return array;
    }

    // Вывод массива
    public static void outputArray(int[] array) {
        System.out.println("Вывод массива...");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" | " + array[i]);
        }
    }
}
