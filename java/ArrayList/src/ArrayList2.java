import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        mainList.add(list1);
        System.out.println(mainList);
    }
}
