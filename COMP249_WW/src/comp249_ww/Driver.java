package comp249_ww;

public class Driver {

    public static void main(String[] args) {

        OurDLinkedList list = new OurDLinkedList();

        list.addAtHead(10);
        list.addAtTail(20);
        list.addAfter(10, 15);
        //list.addAtTail(7);
        //list.addAtTail(14);
        //list.addAtHead(10);
        //list.addAtHead(5);
        //list.addAtHead(2);
        System.out.println(list.removeHead());
        list.displayForward();
        list.displayBackward();


        /* Driver for Simple Linked Lists
        OurLinkedList list1 = new OurLinkedList();

        list1.addAtHead(15);
        list1.addAtEnd(25);
        list1.addAfter(25, 80);
        //int value = list1.removeHead();
        //int value = list1.removeEnd();
        //int value = list1.removeAfter(80);
        //System.out.println(value);
        //System.out.println(value);
        //list1.addAtEnd(30);
        //list1.addAtHead(10);
        System.out.println(list1.removeValue(25));
        list1.display();
         */
    }

}
