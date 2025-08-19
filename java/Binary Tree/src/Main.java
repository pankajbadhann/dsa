public class Main {
    public static void main(String[] args) {
        Build_Tree.Node root = new Build_Tree.Node(1);
        root.left = new Build_Tree.Node(2);
        root.right = new Build_Tree.Node(3);
        root.left.left = new Build_Tree.Node(4);
        root.left.right = new Build_Tree.Node(5);
        root.right.left = new Build_Tree.Node(6);
        root.right.right = new Build_Tree.Node(7);
//        System.out.println(Height_of_the_tree.height(root));
//        System.out.println(Count_Nodes.count_nodes(root));
//        System.out.println(Sum_of_nodes.sum(root));
//        System.out.println(Diameter_of_tree.diameter(root));
//        System.out.println(Diameter_of_tree.diameter(root));

    }
}