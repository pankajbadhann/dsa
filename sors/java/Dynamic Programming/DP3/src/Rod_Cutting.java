public class Rod_Cutting {
    public static int rod_cutting(int[] prices, int[] length, int total_rod) {
        int n = prices.length;
        int[][] dp = new int[n + 1][total_rod + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < total_rod + 1; j++) {
                if (length[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j - length[i - 1]] + prices[i - 1], dp[i - 1][j]);
                } else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][total_rod];
    }

    public static void main(String[] args) {
        int[] length = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] prices = {1, 5, 8, 10, 17, 20};
        int total_rod = 8;

        System.out.println(rod_cutting(prices, length, total_rod));
    }
}