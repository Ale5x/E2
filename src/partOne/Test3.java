package partOne;

public class Test3 {

    /*
    Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в
    нем отрицательных, положительных и нулевых элементов
     */

    public static void main(String[] args) {

    int[] array = {5, 561, -54, 0, -549, 44, -58, 0, -874, 12, -21412, -1, 9, 0};

    initializeArray(array);
}

    // Вывод массива согласно условию
    public static void initializeArray(int[] mas){
        int countMinus = 0;
        int countPlus = 0;
        int countNull = 0;
        System.out.println("Вывод массива...");
        for(int i = 0; i < mas.length; i++){
            if(mas[i] > 0){
                countPlus++;
            }else if(mas[i] < 0){
                countMinus++;
            }else if(mas[i] == 0){
                countNull++;
            }
            System.out.print(mas[i] + " | ");
        }

        System.out.println("\nКоличество положительных цифр - " + countPlus);
        System.out.println("Количество отрицательных цифр - " + countMinus);
        System.out.println("Количество цифр равных 0 - " + countNull);
    }
}
