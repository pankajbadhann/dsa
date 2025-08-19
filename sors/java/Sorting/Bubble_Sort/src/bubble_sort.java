import java.util.Arrays;

public class bubble_sort {

    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int swap = 0;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap++;
                    System.out.println(swap);
                }
            }
            if(swap==0){
                System.out.println(swap);
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {3,6,2,1,8,7,4,5,3,1};
        System.out.println(Arrays.toString(sort(a)));
    }
}
