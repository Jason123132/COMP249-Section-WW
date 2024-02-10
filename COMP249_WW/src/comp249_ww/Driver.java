package comp249_ww;

public class Driver {

    public static void main(String[] args) {

        Address myAddress = new Address(123, "Rene-Levesque", "Montreal");

        Person st1 = new Student("John", 20, myAddress, "Computer Science", 4.1);
        Student st2 = new Student("John", 20, myAddress, "Computer Science", 4.1);

        //Student st3 = st1;
        st1.f();

//        if (st1.equals(st2)) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not equal.");
//        }
        //Person p1 = new Person();
        //Person p2 = new Person("sdfsd", 7);
        //System.out.println(p1.toString());
        //Address myAddress = new Address(123, "Rene-Levesque", "Montreal");
        //Person p3 = new Person("John", 19, myAddress);
        //Person p3 = new Person("John", 19, new Address(123, "Rene-Levesque", "Montral"));
        //Person p3 = new Person("John", 19, 123, "Rene-Levesque", "Montreal");
        //System.out.println(p3.getAddress().getCityName());
        //Person p4 = new Person(p3);
        //p3.getAddress().setCityName("Quebec");
        //System.out.println(p3.getAddress());
        //System.out.println(p4.getAddress());
        //System.out.println(p1);
        //someMethod(p1);
        //System.out.println(p1);
        //int a = 10;
        //f(a);
        //System.out.println(a);
    }
    /*
    public static void someMethod(Person p) {
        //p.setName("Ali");
        p = new Person("Justin", 50, "Ottawa");
    }

    public static void f(int x) {
        x = x * 2;
    }
     */
}
