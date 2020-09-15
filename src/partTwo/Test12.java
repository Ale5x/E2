package partTwo;

import java.util.Arrays;

public class Test12 {

    /*
    Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
     */

    public static void main(String[] args) {

        int size = 7;
        int[][] matrix = new int[size][size];

        initializeMatrix(matrix);
        outputMatrix(matrix);
        sortRowPlusAndOutputMatrix(matrix);
        sortRowMinusAndOutputMatrix(matrix);
    }

    // Инициализация матрицы произвольными значениями
    public static int[][] initializeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    // сортировка строк по возрастанию и вывод матрицы
    public static void sortRowPlusAndOutputMatrix(int[][] matrix) {
        int[] mas = new int[matrix.length];
        System.out.println("Сортировка строк по возрастанию");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                mas[j] = matrix[i][j];
            }
            Arrays.sort(mas);
            for (int n = 0; n < matrix.length; n++) {
                System.out.print(" | " + mas[n]);
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }

    // Вывод матрицы
    public static void outputMatrix(int[][] matrix) {
        System.out.println("Вывод матрицы...");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" | " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }

    // Сортировка строк по убыванию и вывод матрицы
    public static void sortRowMinusAndOutputMatrix(int[][] matrix) {
        System.out.println("Сортировка строк в убывающем порядке");
        int[] mas = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                mas[j] = matrix[i][j];
            }
            Arrays.sort(mas);
            int numberMinus = matrix.length - 1;
            for (int r = 0; r < matrix.length; r++) {
                matrix[i][r] = mas[numberMinus];
                System.out.print(" | " + matrix[i][r]);
                numberMinus--;
            }
            System.out.println();
        }
    }
}

