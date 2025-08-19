import java.util.HashMap;

public class Majority_Element {
    public static int majority_element(int []arr){
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int ele:arr) {
//            if(hm.containsKey(ele))
//                hm.put(ele, hm.get(ele)+1);
//            hm.put(ele, 1);
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        for (Integer key: hm.keySet()) {
            if (hm.get(key)>arr.length/3)
                ans = key;
        }
        return ans;
    }
}
