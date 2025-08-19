public class Wildcard_matching {
    public static boolean wildcard_matching(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {

                dp[0][0] = true;
                dp[i][0] = false;

        }

        for (int j = 1; j < m + 1; j++) {
            if (p.charAt(j - 1) == '*')
                dp[0][j] = dp[0][j - 1];
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
//                case1 :
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?')
                    dp[i][j] = dp[i - 1][j - 1];
//                case2:
                else if (p.charAt(j - 1) == '*')
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
//                case3:
                else
                    dp[i][j] = false;
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String s ="aa";
        String p = "*****a";
        System.out.println(wildcard_matching(s, p));
    }
}
