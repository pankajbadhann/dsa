import java.util.ArrayList;
import java.util.HashSet;

public class Union_Intersection {
    public static String union(int a[], int b[]) {
        HashSet<Integer> ans = new HashSet<>();
        for (int ele : a) {
            ans.add(ele);
        }
        for (int ele : b) {
            ans.add(ele);
        }
        return "Union of 2 arrays: "+ans+" and no. of unique elements: "+ans.size();
    }

    public static String intersection(int a[], int b[]) {
        HashSet<Integer> ans = new HashSet<>();
        for (int ele: a) {
            ans.add(ele);
        }
        ArrayList<Integer> result= new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
           if(ans.contains(b[i])){
               ans.remove(b[i]);
               result.add(b[i]);
           }
        }

        return "Intersection of two arrays is: "+ result +", elements: "+ result.size() ;
    }

    public static void main(String[] args) {
//        System.out.println(union(new int[]{1, 2, 3, 4, 5}, new int[]{2, 4, 6}));
        System.out.println(intersection(new int[]{1, 2, 3, 4, 5}, new int[]{2, 4, 6}));
    }
}
