package partTwo;

public class Test6 {

    /*
   Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

                                1   1   1   ...   1   1   1
                                0   1   1   ...   1   1   0
                                0   0   1   ...   1   0   0
                                0   0   0   ...   0   0   0
                                ... ... ... ... ... ... ...
                                0   0   1   ...   1   0   0
                                0   1   1   ...   1   1   0
                                1   1   1   ...   1   1   1
     */

    public static void main(String[] args) {

        int size = 9;
        int[][] matrix = new int[size][size];

        initializeMatrix(matrix);
        outputMatrix(matrix);
    }

    // Инициализация матрицы согласно условию задания
    public static int[][] initializeMatrix(int[][] matrix) {
        int numberNull = 0;
        int count = 0;
        int medium = matrix.length / 2;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 1;
                if(count > j && !(i == 0) && !(i == matrix.length - 1)) {
                    matrix[i][j] = numberNull;
                }
                if((matrix.length - count) <= j && !(i == 0) && !(i == matrix.length - 1)) {
                    matrix[i][j] = numberNull;
                }
            }

            if(medium > i) {
                count++;
            }else {
                count--;
            }
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

