package partFour;

public class Test17 {

    /*
     	Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
     Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
     */

    public static void main(String[] args) {

        int number = 100;

        different(number);
    }

    // Метод в котором вычисляется количество операций согласно заданию
    public static void different(int number){
        int odd = 0;
        System.out.println("Start - " + number);
        while (number > 0 ){
            String lineNumber = Integer.toString(number);
            char[] chars = lineNumber.toCharArray();
            for(int i = 0; i < chars.length; i++){
                int numberOne = Character.getNumericValue(chars[i]);
                number -= numberOne;
            }
            System.out.println("Число - " + number);
            odd++;
            if(number == 0) break;
        }
        System.out.println("Количество операций - "+ odd);
    }
}
