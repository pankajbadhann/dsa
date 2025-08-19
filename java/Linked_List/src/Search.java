public class Search extends Linked_list {
    public static int search(int key) { //iterative
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key)
                return i;
            temp = temp.next;
            i++;

        }
        return -1;
    }
    public static int search(Node head, int key){ //recursive
        if(head == null)
            return -1;
        if(head.data == key)
            return 0;
        int index = search(head.next, key);

        return index == -1 ? -1 : index+1;
    }

    public static void main(String[] args) {
        Linked_list l = new Linked_list();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        System.out.println(search(3));
        System.out.println(search(5));
        System.out.println(search(head, 3));
        System.out.println(search(head, 5));
    }
}
