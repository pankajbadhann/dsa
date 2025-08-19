public class Friends_pairing {
    public static int pair_friends(int n){
//        base case
        if(n == 1 || n == 2)
            return n;

//        choice
//        single
        int f1 = pair_friends(n-1);

//        pair
        int f2 = pair_friends(n-2);

        int pair_ways = (n-1)*f2;
        return pair_ways+f1;
    }

    public static void main(String[] args) {
        System.out.println(pair_friends(3));
    }
}
