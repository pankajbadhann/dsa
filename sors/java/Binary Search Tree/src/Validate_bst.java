import java.util.ArrayList;

public class Validate_bst  {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static boolean valid_bst(Node root, Node min , Node max){
           if(root == null)
               return true;
           if(min!=null && min.data>=root.data)
               return false;
           else if (max!=null && max.data<=root.data)
               return false;

           return valid_bst(root.left, min, root) && valid_bst(root.right,root,max);

    }
    public static boolean validate_bst(Node root){
        if (root == null)
            return true;
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1))
                return false;
        }
        return true;
    }
    public static void inorder(Node root, ArrayList<Integer> list){
        if(root == null)
            return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);

    }

    public static void main(String[] args) {
        Validate_bst tree = new Validate_bst();
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        System.out.println(valid_bst(root,null,null));
        System.out.println(validate_bst(root));
    }
}
