import java.util.Arrays;

public class Q1 {

    public static int[] bubble_sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int swap = 0;
            for (int j = 0; j < a.length - 1-i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {    
                break;
            }
        }
        return a;
    }
    public static int [] selection_sort(int []a){
        for (int i = 0; i < a.length-1; i++) {
            int max_position = i;
            for (int j = i; j < a.length; j++) {
                if(a[j]>a[max_position]){
                    max_position = j;
                }
            }
            int temp = a[max_position];
            a[max_position] = a[i];
            a[i] = temp;
        }
        return a;
    }
    public static int[] insertion_sort(int[]a){

        for (int i = 1; i < a.length; i++) {
             int curr = a[i];
             int prev = a[i];

             while(prev >0 && a[prev]<curr){
                a[prev+1] = curr;
                prev--;
             }
             a[prev+1] = curr;
        }

        return a;
    }
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(bubble_sort(new int []{3,6,2,1,8,7,4,5,3,1})));
        // System.out.println(Arrays.toString(selection_sort(new int []{3,6,2,1,8,7,4,5,3,1})));
        System.out.println(Arrays.toString(insertion_sort(new int []{3,6,2,1,8,7,4,5,3,1})));
    }

}