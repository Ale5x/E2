package partFour;

public class Test16 {

    /*
    	Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
     */

    public static void main(String[] args) {

        int[] array = new int[20];

        initializeArray(array);
        outputArray(array);
        searchOddArray(array);
}

    // Инициализация массива нечётными числами
    public static int[] initializeArray(int[] array){
        for(int i = 0; i < array.length; i++){
            int number = (int) (Math.random() * 1000);
            if(!(number % 2 == 0)) {
            array[i] = number;
        }
        }
        return array;
    }

    // Вывод массива
    public static void outputArray(int[] mas){
        System.out.println("Вывод массива...");
        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " | ");
        }

        System.out.println("\n------------------------------------------");
    }

    // поиск нечетных чисел в числе и их сумму
    public static void searchOddArray(int[] mas) {
        int sumOdd = 0;
        for (int i = 0; i < mas.length; i++) {
            int sumOddOne = 0;
            if (!(mas[i] % 2 == 0)) {
                String s = Integer.toString(mas[i]);
                char[] ch = s.toCharArray();
                for (int t = 0; t < ch.length; t++) {
                    int number = Character.getNumericValue(ch[t]);
                    sumOddOne += number;
                    sumOdd += number;
                }
                System.out.println("Сумма цифр нечётного числа - " + mas[i] + ". Составляет - " + sumOddOne);
                searchEvenNumbersInSum(sumOddOne);
            }
        }
    }

    // определение количество чётных чисел в сумме цифр нечетного числа
    public static void searchEvenNumbersInSum(int sumOddNumbers) {
        System.out.println("Колличество четных цифр в полученной сумме:");
        int quantity = 0;
        String lineSumOddNumbers = Integer.toString(sumOddNumbers);
        char[] charSum = lineSumOddNumbers.toCharArray();
        for(int j = 0; j < charSum.length; j++){
            int numberQuantity = Character.getNumericValue(charSum[j]);
            if(numberQuantity % 2 == 0){
                quantity++;
            }
        }
        System.out.println("Количество чётных цифр в числе - " + sumOddNumbers + ". Составляет "
                + quantity + " числа");
        System.out.println("------------------------------");
    }
}
