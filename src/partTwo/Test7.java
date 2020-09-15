package partTwo;

import java.text.DecimalFormat;

public class Test7 {

    /*
     Сформировать квадратную матрицу порядка N по правилу:

                        A[I,J] = sin ((I * I - J * J) / N

     и подсчитать количество положительных элементов в ней.
     */

    public static void main(String[] args) {

        int size = 6;
        double[][] matrix = new double[size][size];
        initializeMatrix(matrix);
        outputMatrix(matrix);
    }

    // Инициализация матрицы согласно условию задания
    public static double[][] initializeMatrix(double[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length;j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / matrix.length);
            }
        }
        return matrix;
    }

    // Вывод матрицы
    public static void outputMatrix(double[][] matrix) {
        System.out.println("Вывод матрицы...");
        DecimalFormat format = new DecimalFormat("#.##");
        int countNumberPositive = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] >= 0) {
                    countNumberPositive++;
                }
                System.out.print(" | " + format.format(matrix[i][j]));
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов в матрице - " + countNumberPositive);
    }
}
