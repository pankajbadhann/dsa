public class Answer {
    public static void bubble_sort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[i]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void selection_sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int min_position = i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[min_position]<a[i])
                    min_position = j;
            }
            int temp = a[i];
            a[i] = a[min_position];
            a[min_position] = temp;
        }
    }
}
