
public class Kth_Level extends Build_Tree {
    public static void kth_level(Node root, int k, int level) {
//        iterative
//        if(root == null)
//            return;
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        q.add(null);
//        level = 1;
//        while(!q.isEmpty()){
//            Node node = q.remove();
//            if(node == null){
//                level++;
//                if(q.isEmpty())
//                    break;
//                else
//                    q.add(null);
//            }
//            else{
//                if(level == k){
//                    System.out.print(node.data + " ");
//                    break;
//                }
//                if(node.left!=null)
//                    q.add(node.left);
//                if(node.right!=null)
//                    q.add(node.right);
//            }
        //recursively
        if (root == null)
            return;
        if (level == k) {
            System.out.print(root.data);
            return;
        }
        kth_level(root.left, k, level + 1);
        kth_level(root.right, k, level + 1);
    }



    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = Binary_Tree.buildTree(nodes);
        kth_level(root, 3,1);

    }
}
