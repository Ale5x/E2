package partFour;

public class Test11 {

    /*
    	Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
     */
    public static void main(String[] args) {

        int numberOne = 1648;
        System.out.println("Первое число " + numberOne);
        int numberTwo = 61118;
        System.out.println("Второе число " + numberTwo);
        System.out.println("------------------");

        searchMaxCountNumber(numberOne, numberTwo);
    }

    // Поиск числа, в котором находится максимально число цифр
    public static void searchMaxCountNumber(int numberOne, int numberTwo) {

        String sOne = Integer.toString(numberOne);
        String sTwo = Integer.toString(numberTwo);

        char[] charOne = sOne.toCharArray();
        char[] charTwo = sTwo.toCharArray();

        if(charOne.length > charTwo.length){
            System.out.println("В первом числе больше цифр. Число " + numberOne);
        }else {
            System.out.println("Во-втором числе больше цифр. Число " + numberTwo);
        }
    }
}
