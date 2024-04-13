package oldclasses;

public class OurCLinkedList<T> {

    private Node head;
    private Node tail;
    private int size;

    public OurCLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Add at head
    public void addAtHead(T value) {
        if (head == null) {
            head = new Node(value, null);
            head.next = head;
            tail = head;
            size++;
        } else {
            head = new Node(value, head);
            tail.next = head;
            size++;
        }

    }

    // Add at tail
    public void addAtTail(T value) {
        if (tail == null) {
            addAtHead(value);
        } else {
            Node n = new Node(value, head);
            tail.next = n;
            tail = tail.next;
            size++;
        }
    }

    // Add after
    //Add before
    // Remove head
    public T removeHead() {
        if (head == null) {
            return null;
        } else if (size == 1) {
            Node temp = head;
            head = null;
            tail = null;
            size = 0;
            return temp.value;
        } else {
            Node temp = head;
            head = head.next;
            tail.next = head;
            size--;
            return temp.value;
        }

    }

    // Remove tail
    public T removeTail() {
        if (head == null) {
            return null;
        } else {
            Node position = head;

            while (position.next != tail) {
                position = position.next;
            }

            Node temp = tail;
            position.next = head;
            tail = position;
            size--;
            return temp.value;
        }
    }

    // Remove value
    // get size
    public int getSize() {
        return this.size;
    }

    // display
    public void display() { // NEEDS CHECK
        if (size == 0) {
            System.out.println("Your list is empty.");
        } else {
            System.out.println("Your list has " + size + " element(s): ");
            System.out.println(head.value);
            Node position = head.next;
            while (position != head) {
                System.out.println(position.value);
                position = position.next;
            }
        }
    }

    class Node {

        private T value;

        private Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
