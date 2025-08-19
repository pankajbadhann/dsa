public class Main {
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Binary_Search_Tree.Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = Binary_Search_Tree.build_BST(values[i],root);

        }
//        Binary_Search_Tree.print(root);
//        System.out.println(Binary_Search_Tree.search(root, 30));
          root = Binary_Search_Tree.delete(root, 4);
//        System.out.println(root.data);
        Binary_Search_Tree.inorder(root);
    }


}