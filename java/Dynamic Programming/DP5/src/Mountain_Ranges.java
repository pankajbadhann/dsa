public class Mountain_Ranges {
    public static int ranges(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                int inward = dp[j];
                int outward = dp[i - j - 1];
                dp[i] += inward * outward;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(ranges(4));
    }
}
