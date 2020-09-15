package partTwo;

public class Test9 {

    /*
        Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить,
    какой столбец содержит максимальную сумму.
     */

    public static void main(String[] args) {

        int size = 7;
        int[][] matrix = new int[size][size];
        initializeMatrix(matrix);
        outputMatrix(matrix);
        sumOutputMatrix(matrix);
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
        System.out.println("Вывод матрицы...");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j <matrix.length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }

    // Подсчёт суммы элементов в каждом столбце и нахождение максимальной суммы в столбце
    public static void sumOutputMatrix(int[][] matrix) {
        int sumMatrix = 0;
        int columnName = 0;
        int number = 0;
        for(int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][number];
            }
            System.out.println("Sum - " + sum + ": " + " Column - " + (number + 1));
            number++;
            if (sum > sumMatrix) {
                sumMatrix = sum;
                columnName = number;
            }
        }
        System.out.println("----------------------");
        System.out.println("Max sum matrix " + sumMatrix);
        System.out.println("Max сумма в столбце -  " + columnName + ". Сумма в столбце - " + sumMatrix);
    }
}

