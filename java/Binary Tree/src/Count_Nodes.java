public class Count_Nodes extends Build_Tree {
    public static int count_nodes(Node root){
        if(root == null)
            return 0;
        int lc = count_nodes(root.left);
        int rc = count_nodes(root.right);
        return lc+rc+1;
    }
}
