import java.util.Arrays;

public class Minimum_Absolute_difference {
    public static int minimum_absolute_difference(int[]a, int []b){
        Arrays.sort(a);
        Arrays.sort(b);
        int min_difference = 0;
        for (int i = 0; i < a.length; i++) {
            min_difference += Math.abs(a[i]-b[i]);
        }
        return min_difference;
    }

    public static void main(String[] args) {
        System.out.println(minimum_absolute_difference(new int[]{1,4,7,3}, new int[]{2,5,6,8}));
    }
}
