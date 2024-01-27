package comp249_ww;

public class Driver {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("sdfsd", 7);
        Person p3 = new Person("John", 19, "Montreal");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }

}
