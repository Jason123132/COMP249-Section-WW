package oldclasses;

public class InterfaceExample1Driver {

    public static void main(String[] args) {

        OurFirstInterface obj = new SomeClass();
        OurFirstInterface obj2 = new AnotherClass();

        OurFirstInterface objects[] = new OurFirstInterface[5];

        objects[0] = obj;
        objects[1] = obj2;

        for (OurFirstInterface o : objects) {
            if (o != null) {
                System.out.println(o.method1(7));
            }
        }
    }
}
