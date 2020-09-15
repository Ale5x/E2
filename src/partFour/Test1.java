package partFour;

public class Test1 {

    /*
        Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного
    двух натуральных чисел
     */

    public static void main(String[] args) {

        int numberOne = 7;
        int numberTwo = 30;

        System.out.println("НОД чисел '" + numberOne + "' и '" + numberTwo + "' является: " + searchNOD(numberOne, numberTwo));
        System.out.println("НОК чисел '" + numberOne + "' и '" + numberTwo + "' является: " + searchNOK(numberOne, numberTwo));

    }

    // Поиск НОД (Наибольший общий делитель)
    public static int searchNOD(int numberOne, int numberTwo) {
        while (numberOne != numberTwo) {
            if (numberOne > numberTwo) {
                numberOne = numberOne - numberTwo;
            } else {
                numberTwo = numberTwo - numberOne;
            }
        }
        return numberOne;
    }

    // Поиск НОК (Наименьшее общее кратное)
    public static int searchNOK(int numberOne, int numberTwo) {

            int numberNOK;
            if (numberOne < numberTwo) {
                numberNOK = numberTwo;
            }else {
                numberNOK = numberOne ;
            }

            boolean isNext = true;
            while (isNext) {
                if ((numberNOK % numberOne == 0) && (numberNOK % numberTwo == 0)) {
                    break;
                }else {
                    numberNOK += 1;
                }
            }
            return numberNOK;
        }
}
