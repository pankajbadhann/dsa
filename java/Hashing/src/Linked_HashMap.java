import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Linked_HashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
        lm.put("India", 100);
        lm.put("China", 200);
        lm.put("Pakistan", 30);
        lm.put("Nepal", 30);
        System.out.println(lm);

        HashMap<String, Integer> hm = new HashMap<>();
        for (String s: lm.keySet()) {
            hm.put(s, lm.get(s));
        }
        System.out.println(hm);

        TreeMap<String, Integer> tm = new TreeMap<>();
        for (String s: lm.keySet()) {
            tm.put(s, lm.get(s));
        }
        System.out.println(tm);
    }
}
