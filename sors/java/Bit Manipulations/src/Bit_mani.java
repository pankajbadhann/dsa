public class Bit_mani {
    public static boolean power_of_two(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int count_set_bits(int n) {
//        start iterating from the lsb by right shift by 1 and check if is 1 then increase the count by 1 else by 0
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0)
                count ++

                        ;
            n = n >> 1;
        }

        return count;
    }
    public static int power(int a, int b){
        int ans = 1;
        while(b > 0){
            if((b & 1) !=0){
                ans *= a;
            }
            a *=a;
            b >>=1;
        }
        return ans;
    }

    public static void main(String[] args) {
//        System.out.println(power_of_two(36));
//        System.out.println(count_set_bits(10));
        System.out.println(power(2,3));

    }
}
