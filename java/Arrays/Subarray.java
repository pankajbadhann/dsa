public class Subarray {
    public static void print_subarray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = start; j < a.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(a[k] + " ");
                }
            }
        }
    }

    public static int max_sum_subarray(int[] a) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int start = i;
            for (int j = start; j < a.length; j++) {
                int end = j;
                curr_sum = 0;
                for (int k = start; k <= end; k++) {
                    curr_sum += a[k];
                }
                System.out.println(curr_sum);
                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                }
            }
        }
        return max_sum;
    }


    public static void main(String[] args) {
        int[] a = {1, -2, -3, 4};
//        print_subarray(a);
        System.out.println(max_sum_subarray(a));
//        System.out.println(min_sum_subarray(a));
    }
}