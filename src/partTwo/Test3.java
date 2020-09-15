package partTwo;

import java.util.Scanner;

public class Test3 {

    /*
    Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
     */

    public static void main(String[] args) {

        int[][] matrix = new int[9][9];
        initializeMatrix(matrix);
        outputMatrix(matrix);
        outputMatrixColumnRowUser(matrix);
    }

    // Инициализация матрицы произвольными числами
    public static int[][] initializeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    // Вывод матрицы
    public static void outputMatrix(int[][] matrix) {
        System.out.println("Вывод матрицы...");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }

    //
    public static void outputMatrixColumnRowUser(int[][] matrix) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите номер столбца - ");
        int column = 0;
        int row = 0;
        if(reader.hasNextInt()) {
            column = reader.nextInt();   // столбец
        }else System.out.println("Введено не число...");
        System.out.print("Введите номер строки - ");
        if(reader.hasNextInt()) {
            row = reader.nextInt();   // строка
        }else System.out.println("Введено не число...");
        System.out.println("\nВыввод строки под №" + column);
        for (int j = 0; j < matrix.length; j++) {
            System.out.print(" | " + matrix[column - 1][j]);  // column - 1  потому что счёт начинается с 0, а на экране с 1
        }
        System.out.println();
        System.out.println("Вывод столбца под №" + row);
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(" | " + matrix[i][row - 1]);
        }
    }
}

