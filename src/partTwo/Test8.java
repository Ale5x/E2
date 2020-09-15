package partTwo;

import java.util.Scanner;

public class Test8 {

    /*
        В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного
    столбца поставить на соответствующие им позиции другого, а его элементы второго переместить
    в первый. Номера столбцов вводит пользователь с клавиатуры.
     */

    public static void main(String[] args) {

        int size = 8;
        int[][] matrix = new int[size][size];

        initializeMatrix(matrix);
        outputMatrix(matrix);
        replaceMatrix(matrix);
        System.out.println("Вывод массива после замены столбцов:");
        outputMatrix(matrix);
    }

    // Инициализация матрицы
    public static int[][] initializeMatrix(int[][] matrix){
        int matrixSize = matrix.length - 1;
        for(int i = 0; i < matrixSize; i++) {
            for(int j = 0; j < matrixSize; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    //Вывод матрицы
    public static void outputMatrix(int[][] matrix) {
        System.out.println("Вывод массива");
        int matrixSize = matrix.length - 1;
        for(int i = 0; i < matrixSize; i++) {
            for(int j = 0; j <matrixSize; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    // Замена в матрице согласно заданию
    public static int[][] replaceMatrix(int[][] matrix){

            Scanner inReader = new Scanner(System.in);
            System.out.print("Введите номер столбца: ");
            int columnOne = 0;
            int columnTwo = 0;
            if (inReader.hasNextInt()) {
                columnOne = inReader.nextInt() - 1;
            } else {
                System.out.println("Вы ввели не целое число");
            }
            System.out.println();
            System.out.print("Введите номер столбца c которым нужно произвести замену: ");
            if (inReader.hasNextInt()) {
            columnTwo = inReader.nextInt() - 1;
        }else {
            System.out.println("Вы ввели не целое число");
        }
            System.out.println();
            System.out.println("-----------------------");

            int matrixSize = matrix.length - 1;
            for (int i = 0; i < matrixSize; i++) {
                for (int j = 0; j < matrixSize; j++) {
                    matrix[i][7] = matrix[i][columnOne];
                    matrix[i][columnOne] = matrix[i][columnTwo];
                    matrix[i][columnTwo] = matrix[i][7];
                }
            }
        return matrix;
    }
}
