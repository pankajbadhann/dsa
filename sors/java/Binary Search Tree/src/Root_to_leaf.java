import java.util.ArrayList;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}


public class Root_to_leaf  {
    public static ArrayList<ArrayList<Integer>> root_to_leaf(Node root, ArrayList<Integer>path){

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        path.add(root.data);
        if(root.left == null && root.right == null){
            ans.add(new ArrayList<>(path));
        }
        ans.addAll(root_to_leaf(root.left,path));
        ans.addAll(root_to_leaf(root.right,path));
        path.remove(path.size()-1);
        return ans;
    }
}
