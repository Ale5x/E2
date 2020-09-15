package partFour;

public class Test5 {

    /*
        Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать 
    число, которое меньше максимального элемента массива, но больше всех других элементов).
     */
    
    public static void main(String[] args) {

        int[] array = new int[11];
        initializationArray(array);
        outputArray(array);
        searchMaxPenultimateNumber(array);
    }

    // Инитиализация массива произвольными значениями
    public static int[] initializationArray(int[] x){
        for(int i = 0; i < x.length; i++){
            x[i] = (int) (Math.random() * 100);
        }
        return x;
    }

    // Вывод массива
    public static void outputArray(int[] x){
        System.out.println("Вывод массива...");
        for(int i = 0; i < x.length; i++ ){
            System.out.print(" | " + x[i]);
        }
        System.out.println("\n------------------------------");
    }

    // Поиск предпоследнего максимального значения
    public static void searchMaxPenultimateNumber(int[] x){
        int max = 0;
        int maxSecond = 0;

        for(int i = 0; i < x.length; i++){
            if(x[i] > max){
                maxSecond = max;
                max = x[i];
            }
            if(max > x[i] && x[i] > maxSecond){
                maxSecond = x[i];
            }
        }
        System.out.println("First max number - " + max);
        System.out.println("Second max number - " + maxSecond);
    }
}
