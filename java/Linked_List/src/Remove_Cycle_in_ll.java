public class Remove_Cycle_in_ll extends Detect_cycle_in_linked_list {
    public static void removeCycle(){
//        detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle_exits = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle_exits = true;
                break;
            }
        }
        if(cycle_exits == false)
            return;

//        find the meeting point
        slow = head;
        Node prev = null;
        while (fast!=slow){
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = null;
    }

}
