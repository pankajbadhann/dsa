public class Reverse_Linked_List extends Linked_list {
    public static void reverse(){
        Node prev = null;
        Node curr = head;

        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
}
