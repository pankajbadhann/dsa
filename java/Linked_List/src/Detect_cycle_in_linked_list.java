public class Detect_cycle_in_linked_list extends Linked_list {
    public static boolean cycle_in_linked_list(Node head){
        Node slow = head, fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
