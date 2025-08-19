package Arrays_questions;

import java.util.HashSet;

public class Q1 {
    public static boolean arrays(int[] a) {
//        if (a.length == 1)
//            return true;
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] == a[j])
//                    return true;
//            }
//        }
//        return false;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i <a.length ; i++) {
            if (hashSet.contains(a[i]))
                return true;
            hashSet.add(a[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(arrays(new int[]{1, 2, 3}));
    }
}
