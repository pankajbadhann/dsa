import java.util.Arrays;

public class Matrix_multiplication {
    public static int mcm(int a[], int i, int j) {
        if (i == j) return 0;
        int final_cost = 0;
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcm(a, i, k);//a[i-1]*a[k]
            int cost2 = mcm(a, k + 1, j);//a[k]*a[j]
            int cost3 = a[i - 1] * a[k] * a[j];
            final_cost = cost1 + cost2 + cost3;
            ans = Math.min(final_cost, ans);
        }
        return ans;
    }

    public static int mcm_memorization(int a[], int i, int j, int[][] dp) {

        if (i == j) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        int ans = Integer.MAX_VALUE;

        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcm_memorization(a, i, k, dp);
            int cost2 = mcm_memorization(a, k + 1, j, dp);
            int cost3 = a[i - 1] * a[k] * a[j];
            ans = Math.min(cost1 + cost2 + cost3, ans);
        }
        return dp[i][j] = ans;
    }

    public static int mcm_tabulation(int a[]) {
        int n = a.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }
        for (int len = 2; len <= n - 1; len++) {
            for (int i = 1; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k + 1][j];
                    int cost3 = a[i - 1] * a[k] * a[j];
                    dp[i][j] = Math.min(dp[i][j], cost1 + cost2 + cost3);
                }
            }
        }
        return dp[1][n - 1];
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 3};
        System.out.println(mcm(a, 1, a.length - 1));
        int[][] dp = new int[a.length + 1][a.length + 1];
        for (int i = 0; i < a.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcm_memorization(a, 1, a.length - 1, dp));
        System.out.println(mcm_tabulation(a));
    }
}
