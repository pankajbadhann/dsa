public class Sum_of_nodes extends Build_Tree {
    public static int sum(Node root){
        if(root == null)
            return 0;
        int left_sum = sum(root.left);
        int right_sum = sum(root.right);
        int tree_sum = left_sum+right_sum+root.data;
        return tree_sum;
    }
}
