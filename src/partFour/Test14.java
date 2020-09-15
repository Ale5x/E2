package partFour;

import java.util.ArrayList;
import java.util.List;

public class Test14 {

    /*
        Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
     возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
     использовать декомпозицию.
     */

    public static void main(String[] args) {

        int interval = 1000;

        armstrongNumbers(interval);
    }

    // Метод находит числа Армстронга на интревале...
       public static void armstrongNumbers(int interval){
           System.out.println("Числа Армстронга... ");
            for(int i = 1; i <= interval; i++){
                int result = 0;
                String s = Integer.toString(i);
                char[] arraysChar = s.toCharArray();
                List<Integer> list = new ArrayList<>();
                for(int j = 0; j < arraysChar.length; j++){
                    int numberOne = Character.getNumericValue(arraysChar[j]);
                    list.add(numberOne);
                }
                for(int b = 0; b < list.size(); b++){
                    result += (int) (Math.pow(list.get(b), arraysChar.length));
                }
                if(result == i){
                    System.out.print(" | " + i);
                }
                list.removeAll(list);
            }
        }
    }

