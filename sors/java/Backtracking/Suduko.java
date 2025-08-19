public class Suduko {
    public static void main(String[] args) {
        
    }
    public static boolean suduko_solver(int sudoku[][], int row, int col){
        // base case
        if(row == 9){
            return true;
        }
    
        // Actual recursion
        int next_row = row, next_col = col;
        if(col+1==9){
            next_col = 0;
            next_row = row+1;
        }
        if(sudoku[row][col]!=0){
           suduko_solver(sudoku, next_row, next_col);
        }
        for (int digit = 1; digit < 10; digit++) {
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(suduko_solver(sudoku, next_row, next_col)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int [][] sudoku, int row, int col, int digit){
        // column
        for (int i = 0; i <=8; i++) {
            if(sudoku[i][col] == digit){
                return false;
            }
            if(sudoku[row][i] == digit){// row
                return false;
            }
        }
        // grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for (int i = sr; i < sr+3; i++) {
            for (int j = sc; j < sc+3; j++) {
                if(sudoku[i][j] == digit){
                    return false;
                }

            }
        }
        return true;
    }
}
