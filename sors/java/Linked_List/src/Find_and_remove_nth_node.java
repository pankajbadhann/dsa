public class Find_and_remove_nth_node extends Linked_list {

    public static void delete_nthnode_from_end(int n){
//        to calculate size of linked list
        int size = 0;
        Node temp = head;
        while (temp!=null){
            temp = temp.next;
            size++;
        }
        if(n == size){
            head = head.next;//remove first
            return;
        }
        int i = 1;
        int iToFind = size-n;
        Node prev = head;
        while (i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

    }
}
