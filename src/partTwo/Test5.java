package partTwo;

public class Test5 {

    /*
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

                                    1   1   1   1   ... 1   1
                                    2   2   2   2   ... 2   0
                                    3   3   3   3   ... 0   0
                                    ... ... ... ... ... ... ...
                                    ... ... ... ... ... ... ...
                                    ... ... ... ... ... ... ...
                                    n-1 n-1 0   0   ... 0   0
                                    n   0   0   0   ... 0   0

     */

    public static void main(String[] args) {

        int size = 8;
        int[][] matrix = new int[size][size];

        initializeMatrix(matrix);
        outputMatrix(matrix);
    }

    //  Инитиализация матрицы согласно условию задачи
    public static int[][] initializeMatrix(int[][] matrix) {
        int numberNull = 0;
        int count = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                matrix[i][j] = i + 1;
                if((matrix.length - count) <= j && !(i == 0)) {
                    matrix[i][j] = numberNull;
                }
            }
            count++;
        }
        return matrix;
    }

    // Вывод матрицы
    public static void outputMatrix(int[][] matrix) {
        System.out.println("Вывод матрицы...");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(" | " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
