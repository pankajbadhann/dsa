public class Array_to_Bst {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static Node createBST(int arr[], int start, int end){
        if (start>end)
            return null;
        int mid = (end+start/2);
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
    public static void preorder(Node root){
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Node root = createBST(arr, 0, arr.length-1);
        preorder(root);
    }
}
