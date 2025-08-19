public class Q1 {
    public static boolean distinct(int[] nums) {
        int ans = 0;
        for (int a :nums) {
            ans ^= a;
        }
        return ans == 0? false:true;
    }

    public static void main(String[] args) {
        int []a ={1,1,1,3,3,4,3,2,4,2};
        System.out.println(distinct(a));
    }
}
