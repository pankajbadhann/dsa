public class Max_Segment_trees {
    static int[] tree;

    public static void init(int n) {
        tree = new int[4 * n];
    }

    public static void buildSegmentTree(int i, int si, int sj, int[] a) {
        if (si == sj) {
            tree[i] = a[si];
            return;
        }
        int mid = si + (sj - si) / 2;
        buildSegmentTree(2 * i + 1, si, mid, a);
        buildSegmentTree(2 * i + 2, mid + 1, sj, a);
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }

    public static int getMax(int a[], int qi, int qj) {
        int n = a.length;
        return getMaxUtil(0, 0, n - 1, qi, qj);
    }

    public static void update(int[] a, int idx, int value) {
        a[idx] = value;
        updateUtil(0, idx, 0, a.length - 1, value);
    }

    public static void updateUtil(int i, int idx, int si, int sj, int value) {
        if (idx < si || idx > sj)
            return;
        if (si == sj) {
            tree[i] = value;
            return;
        }
        int mid = si + (sj - si) / 2;
        tree[i] = Math.max(tree[i], value);
        updateUtil(2 * i + 1, idx, si, mid, value);
        updateUtil(2 * i + 2, idx, mid + 1, sj, value);


    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {

        if (si > qj || sj < qi)
            return Integer.MIN_VALUE;
        else if (qi <= si && qj >= sj)
            return tree[i];
        int mid = si + (sj - si) / 2;
        return Math.max(getMaxUtil(i, si, mid, qi, qj), getMaxUtil(i, mid + 1, sj, qi, qj));

    }

    public static int minUtil(int i, int si, int sj, int qi, int qj) {
        if(si>qj||sj<qi)
            return Integer.MAX_VALUE;
        else if(qi<=si && qj>= sj){
            return tree[i];
        }
        int mid = (si+sj)/2;
        return Math.min(minUtil(2*i+1, si, mid, qi, qj), minUtil(2*i+2, mid+1, sj, qi, qj));
    }

    public static int getMin(int a[], int qi, int qj) {
        return minUtil(0, 0, a.length - 1, qi, qj);
    }

    public static void main(String[] args) {
        int a[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        init(a.length);
        buildSegmentTree(0, 0, a.length - 1, a);
        System.out.println(getMax(a, 2, 5));
        System.out.println(getMin(a, 2, 5));
        update(a, 2, 20);
//        for (int i : tree) {
//            System.out.print(i + " ");
//        }
        System.out.println(getMax(a, 2, 5));
        System.out.println(getMin(a, 2, 5));
    }
}
