package src;

public class diagonal_sum {

    public static int diagonal_sum(int[][] matrix) {
        int sum = 0;

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (i == j)
//                    sum += matrix[i][j];
//                else if (i + j == matrix.length - 1)
//                    sum += matrix[i][j];
//            }
//        }
        for (int i = 0; i < matrix.length; i++) {
//            pd
            sum += matrix[i][i];
//            sd
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - i - 1];
        }

        return sum;
    }

    public static boolean search(int[][] matrix, int key){
        int row = 0;
        int col = matrix[0].length-1;
        while(row< matrix.length && col>=0){
            if (matrix[row][col] == key)
                return true;
            else if (key<matrix[row][col]) {
                col--;
            }
            else
                row++;
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        System.out.println(diagonal_sum(matrix));
    }
}
