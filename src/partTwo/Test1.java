package partTwo;

public class Test1 {

    /*
    Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
     */

    public static void main(String[] args) {

        int[][] matrix = new int[9][9];
        initializeMatrix(matrix);
        outputMatrix(matrix);
        outputMatrixIf(matrix);
    }

    // Инициализация матрицы произвольными числами
    public static int[][] initializeMatrix(int[][] matrix) {
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    // Вывод матрицы
    public static void outputMatrix(int[][] matrix) {
        System.out.println("Вывод матрицы:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    // Вывод нечётных стобцов, в котором первый элемент больше последнего
    public static void outputMatrixIf(int[][] matrix) {
        System.out.println("Вывод нечётного столбца, в котором элемент 0-го индекса > элемента последнего индекса");
        int count = 0;
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                if (matrix[(0)][i] > matrix[(8)][i]) {
                    System.out.println(matrix[0][i] + " > " + matrix[8][i]);
                    System.out.println("Вывод столбца №" + (i + 1));
                    if (matrix[(0)][i] > matrix[(8)][i]) {
                        for (int j = 0; j < 9; j++) {
                            System.out.print(" | " + matrix[j][i]);
                        }
                        count++;
                    }
                    System.out.println();
                }
            }
        }
        if (count == 0) {
            System.out.println("Столбцов удовлетворяющих условию нет...");
        }
    }
}

