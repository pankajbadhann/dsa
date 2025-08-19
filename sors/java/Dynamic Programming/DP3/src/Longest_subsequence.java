import java.util.Arrays;

public class Longest_subsequence {
    public static int longest_common_subsequence(String s1, String s2, int n, int l) {
        if (n == 0 || l == 0)
            return 0;
        if (s1.charAt(n - 1) == s2.charAt(l - 1))
            return longest_common_subsequence(s1, s2, n - 1, l - 1) + 1;
        else {
            int ans1 = longest_common_subsequence(s1, s2, n - 1, l);
            int ans2 = longest_common_subsequence(s1, s2, n, l - 1);
            return Math.max(ans1, ans2);
        }
    }

    public static int lcs_memorization(String s1, String s2, int a, int b, int[][] dp) {
        if (a == 0 || b == 0)
            return 0;
        if (dp[a][b]!=-1)
            return dp[a][b];
        else{
            if (s1.charAt(a-1) == s2.charAt(b-1))
                return dp[a][b] = lcs_memorization(s1, s2, a-1, b-1, dp)+1;
            else
                return dp[a][b] = Math.max(lcs_memorization(s1, s2, a-1, b, dp), lcs_memorization(s1, s2, a, b-1, dp));
        }
    }
    public static int lcs_tabulation(String s1, String s2, int a, int b){

        int [][]dp = new int[a+1][b+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i < a+1; i++) {
            for (int j = 1; j <b+1 ; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] +1;
                else{
                    int ans1 = dp[i][j-1];
                    int ans2 = dp[i-1][j];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[a][b];
    }

    public static void main(String[] args) {
        String a = "abcdge";
        String b = "abedg";
        System.out.println(longest_common_subsequence(a, b, a.length(), b.length()));

        int[][] dp = new int[a.length() + 1][b.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lcs_memorization(a,b, a.length(),b.length(), dp));
        System.out.println(lcs_tabulation(a,b,a.length(), b.length()));

    }
}
