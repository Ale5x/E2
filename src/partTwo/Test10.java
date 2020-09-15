package partTwo;

public class Test10 {

    /*
    Найти положительные элементы главной диагонали квадратной матрицы.
     */

    public static void main(String[] args) {

        int size = 7;
        int[][] matrix = new int[size][size];
        initializeMatrix(matrix);
        outputMatrix(matrix);
        outputMatrixDiagonal(matrix);
        outputMatrixDiagonalPlus(matrix);
    }

    // Инициализация матрицы произвольными числами
    public static int[][] initializeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 10 - 5);
            }
        }
        return matrix;
    }

    // Вывод матрицы
    public static void outputMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }

    // Вывод матрицы по диагонали
    public static void outputMatrixDiagonal(int[][] matrix){
        System.out.println("Вывод диагонали матрицы");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(i == j){
                    System.out.print(" " + matrix[i][j]);
                } else System.out.print("   ");

            }
            System.out.println();
        }
        System.out.println("--------------------");;
    }

    // Вывод положительных чисел из диагонали матрицы
    public static void outputMatrixDiagonalPlus(int[][] matrix){
        System.out.println("Вывод положительных чисел из диагонали матрицы");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(i == j){
                    if(Integer.valueOf(matrix[i][j]) >= 0)
                        System.out.print(" | " + matrix[i][j]);
                }
            }
        }
        System.out.println();
        System.out.println("--------------------");
    }
}

