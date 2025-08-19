public class Linked_list  {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
//        step 1: create new node

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

//        step 2: newNode next = head;
        newNode.next = head; //link

//        step 3: head = newNode
        head = newNode;
    }

    public static void addLast(int data) {
//        step 1: to create node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
//               step 2:
        tail.next = newNode;
        tail = newNode;
        size++;

    }

    public static void print(Node head) {
        if (head == null)
            return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void add(int data, int idx) {
        if (idx == 0)
            addFirst(data);

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
//        i = idx-1
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(size == 0)
            return Integer.MIN_VALUE;
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return head.data;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }
//        prev : i = size-2
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;   
    }

    public static void main(String[] args) {
        Linked_list list = new Linked_list();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.add(5, 3);
        list.print(head);
        System.out.println("size:"+ size);
        list.removeFirst();
        list.print(head);
    }
}
