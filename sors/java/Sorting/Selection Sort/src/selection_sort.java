import java.util.Arrays;

public class selection_sort {
    public static int[] selection(int[] a) {
        for (int i = 0; i < a.length-1 ; i++) {
            int min_position = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_position]) {
                    min_position = j;
                }
            }
//            swap
            int temp = a[min_position];
            a[min_position] = a[i];
            a[i] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 1, 3, 2};
        System.out.println(Arrays.toString(selection(a)));
    }
}
