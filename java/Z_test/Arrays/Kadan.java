public class Kadan {
    public static void main(String[] args) {
        int[] a = {1, 2, -3, -2, -5};
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < a.length; i++) {
            cs += a[i];
            if (cs < 0)
                cs = 0;
            ms = Math.max(ms, cs);
        }
        System.out.println(ms);
    }
}
