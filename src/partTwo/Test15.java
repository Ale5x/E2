package partTwo;

public class Test15 {

    /*
    	Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
     */

    public static void main(String[] args) {
        int size = 7;
        int[][] matrix = new int[size][size];
        initializeMatrix(matrix);
        outputMatrix(matrix);
        replaceNumberMatrix(matrix);
        System.out.println("Вывод матрицы после замены...");
        outputMatrix(matrix);
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
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(" | " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
    }

    // Поиск максимального значения в матрице и замена нечетных значений матрицы на максимальное значение
    public static int[][] replaceNumberMatrix(int[][] matrix){
        int numberMax = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] > numberMax) {
                    numberMax = matrix[i][j];
                }
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] % 2 == 0) {

                }else {
                    matrix[i][j] = numberMax;
                }
            }
        }
        System.out.println("------------------------");
        System.out.println("Max number - " + numberMax);
        System.out.println("------------------------");
        return matrix;
    }
}

