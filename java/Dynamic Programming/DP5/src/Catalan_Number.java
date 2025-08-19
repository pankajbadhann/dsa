import java.util.Arrays;

public class Catalan_Number {
    public static int catalan_recursion(int n) {//recursion
        if (n == 1 || n == 0)
            return 1;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += catalan_recursion(i - 1) * catalan_recursion(n - i);
        }
        return ans;
    }

    public static int catalan_memorization(int n, int[] dp) {
        if (n == 0 || n == 1)
            return 1;
        if (dp[n] != -1)
            return dp[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += catalan_memorization(i, dp) * catalan_memorization(n - i - 1, dp);
        }
        return dp[n] = ans;
    }

    public static int catalan_tabulation(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <=n; i++) {
            for (int j = 0; j < i ; j++) {
                dp[i] += dp[j] * dp[i- j - 1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {

        int[] dp = new int[4 + 1];
        Arrays.fill(dp, -1);
        System.out.println(catalan_recursion(4));
        System.out.println(catalan_memorization(4, dp));
        System.out.println(catalan_tabulation(4));
    }
}
