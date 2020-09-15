package partOne;

public class Test1 {
    /*
    В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
     */

    public static void main(String[] args) {

        int[] array = new int[9];
        int divisible = 3;

        initializeArray(array);
        sumNumberDivisible(array, divisible);
    }

    // Инициализация и вывод массива произвольными числами
    public static int[] initializeArray(int[] mas) {
        System.out.println("Вывод произвольных чисел...");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
            System.out.print(" | " + mas[i]);
        }
        return mas;
    }

    // Сумма чисел кратных определенному числу
    public static void sumNumberDivisible(int[] mas, int divisible) {
        int result = 0;
        System.out.println("\nЧисла кратные " + divisible);
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % divisible == 0 & !(mas[i] == 0)) {
                result += mas[i];
                System.out.print(" | " + mas[i]);
            }
        }
        System.out.println("\nСумма чисел кратных - " + divisible + ". Равна - " + result);
    }
}
