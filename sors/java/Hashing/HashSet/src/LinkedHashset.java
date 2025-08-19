import java.util.*;

public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(1);

        for (Integer i: lhs) {
            System.out.println(i);
        }

        Iterator it = lhs.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
