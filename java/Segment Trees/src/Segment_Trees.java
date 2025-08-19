public class Segment_Trees {

    static int[] tree;

    public static void init(int n) {
        tree = new int[4 * n];
    }

    public static int buildSegmentTree(int[] a, int start, int end, int i) {
        if (start == end) {
//           tree[i] = a[start];
            return tree[i] = a[start];
        }
        int mid = (start + end) / 2;
        int left = buildSegmentTree(a, start, mid, 2 * i + 1);
        int right = buildSegmentTree(a, mid + 1, end, 2 * i + 2);
//       tree[i] = left+right;
        tree[i] = tree[(2 * i + 1)] + tree[(2 * i + 2)];
        return tree[i];
    }

    public static int getSum(int a[], int qi, int qj) {
        return getSumUtil(0, 0, a.length - 1, qi, qj);
    }

    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
        if (qi <= si && qj >= sj) {
            return tree[i];
        }
        if (qi > sj || qj < si) {
            return 0;
        }
        int mid = (si + sj) / 2;
        return getSumUtil(2 * i + 1, si, mid, qi, qj) + getSumUtil(2 * i + 2, mid + 1, sj, qi, qj);
    }

    public static void update(int[] a, int idx, int value) {
        int diff = value - a[idx];
        a[idx] = value;
        updateUtil(0, 0, a.length - 1, idx, diff);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int diff) {

        if (idx < si || idx > sj)
            return;
        tree[i] += diff;
        if (si != sj) {
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, diff);
            updateUtil(2 * i + 2, mid + 1, sj, idx, diff);
        }

    }


    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = a.length;
        init(n);
        buildSegmentTree(a, 0, n - 1, 0);

        System.out.println(getSum(a, 2, 5));
        update(a, 2, 2);
        System.out.println(getSum(a, 2, 5));
//        for (int i = 0; i < tree.length; i++) {
//            System.out.print(tree[i] + " ");
//        }
    }
}
