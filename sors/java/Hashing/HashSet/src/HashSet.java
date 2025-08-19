import java.util.Iterator;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<Integer> hash= new java.util.HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(4);
        hash.add(5);
        hash.add(6);
//        using iterators
//        Iterator it = hash.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        using loops
            for(Integer i :hash){
                System.out.println(i);
            }
        }
    }

