import java.util.ArrayList;

public class Print_in_range extends Binary_Search_Tree {
    public static void print(Node root, int k1, int k2) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return;
        if (root.data <= k1 && root.data >= k2) {
            print(root.left, k1, k2);
            list.add(root.data);
//            System.out.println(root.data + "");
            print(root.right, k1, k2);
        } else if (root.data < k1) {
            print(root.left, k1, k2);
        } else {
            print(root.right, k1, k2);
        }
    }
}
