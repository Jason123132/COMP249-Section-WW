package comp249_ww;

public class Driver {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("sdfsd", 7);
        Person p3 = new Person("John", 19, "Montreal");

        System.out.println(p1);
        someMethod(p1);
        System.out.println(p1);

        int a = 10;
        f(a);
        System.out.println(a);

    }

    public static void someMethod(Person p) {
        //p.setName("Ali");
        p = new Person("Justin", 50, "Ottawa");
    }

    public static void f(int x) {
        x = x * 2;
    }

}
