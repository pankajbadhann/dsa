public class BitManipulation {

    public static boolean even(int n) {
        return (n & 1) == 0 ? true : false;
    }

    public static int get_ith_bit(int n, int i) {

        return (n & 1 << i) == 0 ? 0 : 1;
    }

    public static int set_ith_bit(int n, int i) {
        return (n | 1 << i);
    }

    public static int clear_ith_bit(int n, int i) {
        return n & (~(1 << i));
    }

    public static int update_ith_bit(int n, int i, int new_bit) {
//        if (new_bit==0)
//            return set_ith_bit(n, i);
//        return clear_ith_bit(n,1);
        n = clear_ith_bit(n, i);
        return n | (new_bit << i);
    }

    public static int clear_last_i_bits(int n, int i) {
//        int bit_mask = n<<i;
//        return n & bit_mask;

        return n & ~0 << i;
    }

    public static int clearIBits_in_range(int n, int i, int j) {
        int a = ((~0) << j + 1);
        int b = (1 << i) - 1;
        return n & (a | b);
    }

    public static boolean power_of_2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int count_bits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) // check our LSB
                count++;
            n = n >> 1;
        }
        return count;
    }
    public static int fast_expotential(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1) != 0){// check lsb
                ans*=a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {

//        System.out.println(even(-5));
//        System.out.println(get_ith_bit(10, 3));
//        System.out.println(set_ith_bit(10, 2));
//        System.out.println(clear_ith_bit(10, 1));
//        System.out.println(update_ith_bit(10,2,1));
//        System.out.println(clear_last_i_bits(15, 2));
//        System.out.println(power_of_2(89));
        System.out.println(count_bits(10));


    }
}
  