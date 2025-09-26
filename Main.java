public class Main {
    public static int[][] multiplyMatrices(int[][] matrixA, int[][]matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        if (colsA != rowsB){
            throw new IllegalArgumentException("Количество столбцов первой матрице не равно количество строк второй матрицы\n");
        }

        int[][] resultMatrix =  new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++)
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
            }
        }

        return resultMatrix;
    }

    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}};
        int[][] matrixB = {{14}, {13}};

        try {
            int[][] result = multiplyMatrices(matrixA, matrixB);

            for (int[] row : result) {
                for (int elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}