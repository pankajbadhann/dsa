public class Q2 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        int sum =0;
        for (int i = 0; i <a.length ; i++) {
            sum += a[1][i];
        }
        System.out.println(sum);
    }
}
