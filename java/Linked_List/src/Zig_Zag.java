public class Zig_Zag extends Linked_list {
    public static Node zig_zag(Node head){
//        1. Find Mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
//        2. reverse 2nd half of LL
        Node cur = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
//        3. alt merge - zig-zag merging
        while (left!=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
        return head;
    }
}
