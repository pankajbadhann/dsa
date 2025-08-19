import java.util.ArrayList;

public class Merge_BST {
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
    public static void getInorder(Node root, ArrayList<Integer> arr){
        if (root == null)
            return;
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
    public static Node mergeBST(Node root1, Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root1,arr1);
        getInorder(root2,arr2);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i=0, j=0;
        while (i< arr1.size()-1 && j< arr2.size()-1){
            if(arr1.get(i)<=arr2.get(j)){
                arrayList.add(arr1.get(i));
                i++;
            }else {
                arrayList.add(arr2.get(j));
                j++;
            }
        }
        while(i< arr1.size()){
            arrayList.add(arr1.get(i));
            i++;
        }
        while(j< arr2.size()) {
            arrayList.add(arr2.get(j));
            j++;
        }
        return createBST(new ArrayList<Integer>(), 0, arrayList.size()-1);
    }
    public static Node createBST(ArrayList<Integer>arrayList, int s, int e){
        if(s>e){
            return null;
        }
        int mid = (s+e)/2;
        Node root = new Node(mid);
        root.left = createBST(arrayList, s, mid-1);
        root.right = createBST(arrayList, mid+1, e);
        return root;
    }
}
