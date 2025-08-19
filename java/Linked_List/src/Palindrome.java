public class Palindrome extends Linked_list {
    public static void reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }

    public static Node mid(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean Palindrome() {
        if (head == null || head.next == null)
            return true;
//        to find mid
        Node mid = mid(head);
//        reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
//        step 3
        while(right!=null){
            if(left.data!= right.data)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
