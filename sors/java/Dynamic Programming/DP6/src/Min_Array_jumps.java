import java.util.Arrays;

public class Min_Array_jumps {
    public static int min_jumps(int[]a){
        int n = a.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        dp[n-1] = 0;

        for (int i = n-2; i >=0 ; i--) {
            int ans =Integer.MAX_VALUE;
            int steps = a[i];
            for (int j = i+1; j <=steps+i && j<n ; j++) {
                if(dp[j]!=-1)
                    ans =Math.min(ans, dp[j]+1);

            }
           if(ans!=Integer.MAX_VALUE)
               dp[i] = ans;
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int a[] ={2,3,1,1,4};
        System.out.println(min_jumps(a));
    }
}
