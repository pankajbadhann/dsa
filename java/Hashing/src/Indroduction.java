import java.util.HashMap;
import java.util.Set;

public class Indroduction {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 135);
        map.put("China", 200);
        map.put("Pakistan", 30);
        map.put("Nepal", 30);

//        iterate
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String s: keys) {
            System.out.println(s +":"+ map.get(s));
        }
    }
}
