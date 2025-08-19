class Grid_ways{

    public static int ways(int row, int col, int n, int m){

        if(row == n-1 && col == m-1){
            return 1;
        }else if(row==n || col == m){
            return 0;
        }


        int way1 = ways(row+1, col, n, m);
        int way2 = ways(row, col+1, n, m);
        return way1+way2;
    }
    public static void main(String[] args) {
        System.out.println(ways(0, 0, 3, 3));
    }
}