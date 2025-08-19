public class Aug_22 {

    public static int[] reverseArray(int[] a) {

        int x = 0;
        int y = a.length - 1;
        while (x < y) {
            int temp = a[y];
            a[y] = a[x];
            a[x] = temp;
            x++;
            y--;
        }
        return a;
    }

    public static void pair(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                System.out.println("(" + a[i] + "," + a[j] + ")");
            }
        }
    }

    public static void subarray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int start = a[i];
            for (int j = i + 1; j < a.length; j++) {
                int end = a[j];
                for (int k = start; k < end; k++) {
                    System.out.print(a[k]+",");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
//        reverseArray(a);
//        for (int x : a) {
//            System.out.println(x );
//        }
//        pair(a);
        subarray(a);

    }
}
