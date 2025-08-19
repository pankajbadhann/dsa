public class Merge_Sort extends Linked_list {
    public static Node merge_sort(Node head){
//        base case
        if(head == null || head.next == null)
            return head;

//        1. find the mid
        Node mid = getMid();

//        2. left and right MS
        Node right_head = mid.next;
        mid.next = null;
        Node left = merge_sort(head);
        Node right = merge_sort(right_head);

//      3. merge
        return merge(left, right);
    }
    private static Node getMid(){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private static Node merge(Node left, Node right){
        Node merged_LL = new Node(-1);
        Node temp = merged_LL;

        while (left!=null && right!=null){
            if(left.data< right.data){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }
        while (left!=null){
            temp = left;
            left = left.next;
            temp = temp.next;
        }
        while (right!=null){
            temp = right;
            right = right.next;
            temp = temp.next;
        }
        return merged_LL.next;
    }

}
