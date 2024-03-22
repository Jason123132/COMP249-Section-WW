package comp249_ww;

public class Driver {

    public static void main(String[] args) {

        Interface1 obj = new SomeClass();
        Interface1 obj2 = new AnotherSomeClass();

        Interface1[] objects = new Interface1[2];

        objects[0] = obj;
        objects[1] = obj2;

        for (Interface1 o : objects) {
            o.display();
        }

    }

    public static void abc(Interface1 i) {

    }
}
