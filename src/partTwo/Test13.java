package partTwo;

import java.util.Arrays;

public class Test13 {

    /*
    Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов
     */

    public static void main(String[] args) {

        int size = 7;
        int[][] matrix = new int[size][size];
        initializeMatrix(matrix);
        outputMatrix(matrix);
        sortColumnPlusMatrixAndOutput(matrix);
        sortColumnMinusMatrixAndOutput(matrix);

    }

    // Инициализация матрицы произвольными значениями
    public static int[][] initializeMatrix(int[][] matrix){

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    // Вывод матрицы
    public static void outputMatrix(int[][] matrix) {
        System.out.println("Вывод матрицы");

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(" | " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }

    // Сортировка столбцов матрицы по возрастанию и вывод матрицы
    public static void sortColumnPlusMatrixAndOutput(int[][] matrix) {
        System.out.println("Сортировка столбцов по возрастанию...");
        int column = 0;
        int[] mas = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                mas[j] = matrix[j][column];
            }

            Arrays.sort(mas);

            for (int t = 0; t < matrix.length; t++) {
                matrix[t][column] = mas[t];
            }
            column++;
        }

        System.out.println("--------------------------------");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" | " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Сортировка столбцов матрицы по убыванию и вывод матрицы
    public static void sortColumnMinusMatrixAndOutput(int[][] matrix) {
        System.out.println("Сортировка столбцов по убыванию");
        int[] mas = new int[matrix.length];
        int column = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                mas[j] = matrix[j][column];
            }

            Arrays.sort(mas);
            int numberMinus = matrix.length - 1;

            for (int t = 0; t < matrix.length; t++) {
                matrix[t][column] = mas[numberMinus];
                numberMinus--;
            }
            column++;
        }

        System.out.println("--------------------------------");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" | " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}

