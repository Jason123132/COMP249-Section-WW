package comp249_ww;

public class OurDLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public OurDLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Add at head
    public void addAtHead(int newValue) {
        if (size == 0) {
            head = new Node(newValue, null, null);
            tail = head;
        } else {
            Node oldHead = head;
            head = new Node(newValue, null, head);
            oldHead.before = head; // head.after.before
        }

        size++;
    }

    // Add at tail
    public void addAtTail(int newValue) {
        if (size == 0) { //addAtHead(newValue);
            tail = new Node(newValue, null, null);
            head = tail;
        } else {
            Node oldTail = tail;
            tail = new Node(newValue, tail, null);
            oldTail.after = tail;
        }
        size++;
    }

    // Add after a value (going forward)
    public void addAfter(int referenceValue, int newValue) {
        if (head == null) {
            return;
        } else {
            Node position = head;
            while (position != null && position.value != referenceValue) {
                position = position.after;
            }
            if (position == tail) {
                addAtTail(newValue);
            } else {
                if (position != null) {
                    Node n = new Node(newValue, position, position.after);

                    position.after.before = n;
                    position.after = n;
                }
            }
        }
    }

    // Add before value
    // Remove head
    public int removeHead() {
        if (head == null) {
            return -1;
        } else if (size == 1) {
            Node temp = head;
            head = null;
            tail = null;
            size--;
            return temp.value;
        } else {
            Node temp = head;
            head = head.after;
            head.before = null;
            size--;
            return temp.value;
        }
    }

    // Remove tail
    // Remove a value
    // get size
    public int getSize() {
        return size;
    }

    // display Backward/Forward
    public void displayForward() {
        if (size == 0) {
            System.out.println("The list is empty");
        } else {
            System.out.println("The list has " + size + " element(s):");
            Node position = head;
            while (position != null) {
                System.out.println(position.value);
                position = position.after;
            }
        }
    }

    public void displayBackward() {
        if (size == 0) {
            System.out.println("The list is empty");
        } else {
            System.out.println("The list has " + size + " element(s):");
            Node position = tail;
            while (position != null) {
                System.out.println(position.value);
                position = position.before;
            }
        }
    }

    private class Node {

        private int value;
        private Node before;
        private Node after;

        public Node(int value, Node before, Node after) {
            this.value = value;
            this.before = before;
            this.after = after;
        }

    }
}
