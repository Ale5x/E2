package partTwo;

public class Test14 {

    /*
    	Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
    причем в каждом столбце число единиц равно номеру столбца.
     */

    public static void main(String[] args) {
        int size = 7;
        int[][] matrix = new int[size][size];
        initializeMatrix(matrix);
        outputMatrix(matrix);

    }

    // Инициализация матрицы "0" и "1" согласно условию задания
    public static int[][] initializeMatrix(int[][] matrix){
        int size = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(j <= size) {
                    matrix[i][j] = 1;
                }else {
                    matrix[i][j] = 0;
                }
            }
            size++;
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
}
