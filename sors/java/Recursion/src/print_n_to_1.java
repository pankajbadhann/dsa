public class print_n_to_1 {

    public static void print_n_to_1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print_n_to_1(n - 1);
    }

    //    increasing order
    public static void print_1_to_n(int n) {
        if(n==0)
            return;
        print_1_to_n(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {
        print_n_to_1(5);
        System.out.println("********Increasing Order********");
        print_1_to_n(5);
    }

}
