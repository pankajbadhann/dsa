public class BitBiseManipulation {
    public static boolean prime(int n){
        return (n & 1) == 1;
    }
    public static int getIthBit(int n, int i){
        return (n & (1<<i))==0?0:1;
    }
    public static int setithBit(int n, int i){
        return (n | (1<<i));
    }
    public static int clearithbit(int n, int i){
        return (n & (~ (1 <<i)));
    }
    public static int updateithbit(int n, int i, int b){
//        if(b == 0){
//            return clearithbit(n, i);
//        }else {
//            return setithBit(n,i);
//        }
         n = clearithbit(n, i);
        int bit_mask = b << i;
        return n | bit_mask;
    }
    public static int clearIbits(int n, int i){
        int bitmask = ~0 << i;
        return n & bitmask;
    }
    public static int rangeclearbits(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }

    public static void main(String[] args) {
//        System.out.println(5 & 6);
//        System.out.println(5 | 6);
//        System.out.println(5 ^ 6);
//        System.out.println(~5);
//        System.out.println((~5)+1);//2's compliment
//        System.out.println(~0 + 1);
//        System.out.println(5<<1);
//        System.out.println(5>>1);
//        System.out.println(prime(3));
//        System.out.println(getIthBit(10, 3));
//        System.out.println(setithBit(8,2));
//        System.out.println(clearithbit(10, 1));
//        System.out.println(updateithbit(10, 2, 1));
//        System.out.println(clearIbits(15,2));
        System.out.println(rangeclearbits(10, 2, 4));
    }
}
