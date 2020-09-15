package partFour;

public class Test7 {

    /*
    	Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
     */

    public static void main(String[] args) {

        sumFactorial();
    }

    // Вычисление факториалов нечётных чисел
    public static void sumFactorial(){
        int sumFactorial = 1;
        for(int i = 1; i <= 9; i++){
            sumFactorial = sumFactorial * i;
            if(!(i % 2 == 0)){
                System.out.println("Факториал числа - " + i + ". Равен: " + sumFactorial);
            }
        }
    }
}

