public class Reverse_DLL extends Doubly_Linked_List{
    public void reverse(){
        if (head == null || head.next == null)
            return;
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
