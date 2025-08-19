import java.util.ArrayList;

public class Lowest_Common_Ancestor extends Build_Tree {
//    public static Node lca(Node root, int n1, int n2 ){
//        ArrayList<Node> path1 = new ArrayList<>();
//        ArrayList<Node> path2 = new ArrayList<>();
//
//        getPath(root, n1, path1);
//        getPath(root, n2, path2);
//
//        int i = 0;
//        for (; i < path1.size() && i < path2.size() ; i++) {
//              if(path1.get(i)!= path2.get(i))
//                  break;
//        }
//        return new Node(path1.get(i-1)) ;
//    }
    public static boolean getPath(Node root, int n, ArrayList<Node>path){
        if(root == null)
            return false;

        path.add(root);

        if(root.data == n)
            return true;

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft||foundRight)
            return true;
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca2(Node root, int n1, int n2){

        if(root == null || root.data==n1 || root.data==n2)
            return root;

        Node left_lca = lca2(root.left, n1, n2);
        Node right_lca = lca2(root.right, n1, n2);
        if(right_lca == null)
            return left_lca;
        if (left_lca==null)
            return right_lca;
        return root;
    }
}
