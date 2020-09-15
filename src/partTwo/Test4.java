package partTwo;

public class Test4 {

    /*
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

                                1   2   3   ... n
                                n   n-1 n-2 ... 1
                                1   2   3   ... n
                                n   n-1 n-2 ... n
                                1   2   3   ... n
     */

    public static void main(String[] args) {

        int size = 6;
        int[][] matrix = new int[size][size];
        initializeMatrix(matrix, size);
        outputMatrix(matrix);
    }

    // Инициализация матрицы согласно условию задания
    public static int[][] initializeMatrix(int[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            int numbers = 1;
            int sizeNumbers = size;
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = numbers;
                    numbers++;
                } else {
                    matrix[i][j] = sizeNumbers;
                    sizeNumbers--;
                }
            }
        }
        return matrix;
    }

    // Вывод матрицы
    public static void outputMatrix(int[][] matrix) {

        System.out.println("Вывод матрицы...");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("  " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }
}