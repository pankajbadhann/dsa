import java.util.*;

public class Arraylist1 {
    public static ArrayList<Integer> swap(ArrayList<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j, temp);
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list1 = new ArrayList<String>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list);
        list.set(1,4);
        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.contains(2));
        System.out.println(swap(list,0,2));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
