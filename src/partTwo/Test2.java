package partTwo;

public class Test2 {

    /*
    Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
     */

    public static void main(String[] args) {

        int[][] matrix = new int[9][9];
        initializeMatrix(matrix);
        outputMatrix(matrix);
        outputMatrixDiagonal(matrix);
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

    //Вывод матрицы по диагонали
    public static void outputMatrixDiagonal(int[][] matrix) {
        System.out.println("Вывод матрицы по диагонали...");
        int diagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (diagonal == i & diagonal == j) {
                    System.out.print(matrix[i][j]);
                } else System.out.print("   ");
            }
            System.out.println(" ");
            diagonal++;
        }
    }
}
