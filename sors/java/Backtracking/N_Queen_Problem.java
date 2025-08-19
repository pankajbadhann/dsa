<<<<<<< HEAD
public class N_Queen_Problem {
    public static void main(String[] args) {

        int n = 5;
        char[][] board = new char[n][n];
        // initalize
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        nQueen(board, 0);
        System.out.println(count);
    }
    static int count = 0;
    public static boolean nQueen(char[][] board, int row){

        // base case
        if(row == board.length){
            count++;
            // printBoard(board);
            return true;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {

            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueen(board, row+1)){
                    return false;
                }
                board[row][j] = 'x';
            }



            // board[row][j] = 'Q';
            // nQueen(board, row+1);//function call
            // board[row][j] = 'x';//backtracking step;
        }
        return false;
    }

    public static boolean isSafe(char[][]board, int row, int col){

        // verticall up
        for (int i = col; i >=0; i--) {
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // diagonal left up
        for (int i = row-1, j=col-1;  i >= 0 && j>=0; i--, j--) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // diagonal right up
        for (int i = row-1, j= col+1; i>=0 && j<board.length;i--, j++) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char[][]board){
        System.out.println("------------------Chess Board-----------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
=======
public class N_Queen_Problem {
    public static void main(String[] args) {

        int n = 5;
        char[][] board = new char[n][n];
        // initalize
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        nQueen(board, 0);
        System.out.println(count);
    }
    static int count = 0;
    public static boolean nQueen(char[][] board, int row){

        // base case
        if(row == board.length){
            count++;
            // printBoard(board);
            return true;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {

            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueen(board, row+1)){
                    return false;
                }
                board[row][j] = 'x';
            }



            // board[row][j] = 'Q';
            // nQueen(board, row+1);//function call
            // board[row][j] = 'x';//backtracking step;
        }
        return false;
    }

    public static boolean isSafe(char[][]board, int row, int col){

        // verticall up
        for (int i = col; i >=0; i--) {
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // diagonal left up
        for (int i = row-1, j=col-1;  i >= 0 && j>=0; i--, j--) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // diagonal right up
        for (int i = row-1, j= col+1; i>=0 && j<board.length;i--, j++) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char[][]board){
        System.out.println("------------------Chess Board-----------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
>>>>>>> origin/master
