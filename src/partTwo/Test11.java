package partTwo;

public class Test11 {

    /*
        Матрицу 10x20 заполнить случайными числами. Вывести на экран саму матрицу и номера строк,
    в которых число 5 встречается три и более раз
     */

    public static void main(String[] args) {

        int size = 20;
        int[][] matrix = new int[size][size];
        initializeMatrix(matrix);
        outputMatrix(matrix);
        searchMatrixFive(matrix);
    }

    // Инициализация матрицы
    public static int[][] initializeMatrix(int[][] matrix) {
        int lineSize = matrix.length;
        int columnSize = matrix.length / 2;
        for (int i = 0; i < lineSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    // Вывод матрицы
    static void outputMatrix(int[][] matrix) {
        int lineSize = matrix.length;
        int columnSize = matrix.length / 2;
        System.out.println("Вывод матрицы");
        for (int i = 0; i < lineSize; i++) {
            System.out.print("Строка " + (i  + 1) + "    ");
            for (int j = 0; j < columnSize; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------");
    }

    // Поиск максимального нахождения "5" в строках и вывод результата
    public static void searchMatrixFive(int[][] matrix) {
        int lineSize = matrix.length;
        int columnSize = matrix.length / 2;
        System.out.println("Найти наибольшее колличество '5' находящихся в строках");
        int countFive = 0;
        int numberFiveInLine;
        int line = 0;
        int count = 0;

        for (int i = 0; i < lineSize; i++) {
            numberFiveInLine = 0;
            for (int j = 0; j < columnSize; j++) {
                if (matrix[i][j] == 5) {
                    numberFiveInLine++;
                }
            }
            if (numberFiveInLine >= 3) {
                System.out.println("Количество 5 в строке ------" + (i + 1) + "------ их количество равно = ------" + numberFiveInLine + "------");
                count++;
            }
            if (numberFiveInLine > countFive) {
                countFive = numberFiveInLine;
                line = i;
            }
        }
        if (!(count == 0)) {
            System.out.println("\nНаибольшее количество '5' встроке " + (line + 1) + " их количество равно = " + countFive);
        }else {
            System.out.println("\nСоответсвующему условию нет параметров...");
        }
    }
}

