public class Diameter_of_tree extends Build_Tree {
//    public static int height(Node root){
//
//        if(root == null){
//            return 0;
//        }
//        int left = height(root.left);
//        int right = height(root.right);
//        return Math.max(left, right) + 1;
//    }
//    public static int diameter(Node root){
//        if(root==null)
//            return 0;
//        int lh = height(root.left);
//        int ld = diameter(root.left);
//        int rh = height(root.right);
//        int rd = diameter(root.right);
//        int self_diameter = lh+rh+1;
//        return Math.max(Math.max(ld, rd), self_diameter);
//    }
    static class Info{
        int height;
        int diameter;
        public Info(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }
    public static Info diameter_1(Node root){
        if(root == null)
            return new Info(0, 0);
        Info left_info = diameter_1(root.left);
        Info right_info = diameter_1(root.right);

        int diameter = Math.max(Math.max(left_info.diameter,right_info.diameter), left_info.diameter+ right_info.diameter+1);
        int height = Math.max(left_info.height, right_info.height);

        return new Info(diameter, height);
    }
    public static void main(String[] args) {
        Node root = Tree_Traversal.buildTree();
    }
}
