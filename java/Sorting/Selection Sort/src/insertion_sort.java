import java.util.*;

public class insertion_sort {
    public static int[] insertion(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int curr = a[i];
            int prev = i - 1;
//            finding out the correct position to insert the element
            while (prev >= 0 && a[prev] > curr) {
                a[prev + 1] = curr;
                prev--;
            }
//           insertion
            a[prev + 1] = curr;

        }
        return print(a);
    }

    public static int[] print(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
        return a;
    }

    public static Integer[] print(Integer[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 1, 3, 2};
        Integer[] b = {1, 2, 3, 4};
        Arrays.sort(b, Collections.reverseOrder());
        print(b);
    }


}
