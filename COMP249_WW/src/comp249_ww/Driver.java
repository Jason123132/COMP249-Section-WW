package comp249_ww;

public class Driver {

    public static void main(String[] args) {

        A a = new A(10);
        A c = new A(70);

        try {
            A b = (A) a.clone();
        } catch (CloneNotSupportedException cnsex) {
            System.out.println("Clone not supported.");
        }

        System.out.println(a.compareTo(new B()));
    }

}

class A implements Cloneable, Comparable {

    private B b; // B is mutable
    private C c; // C is mutable
    private int number; // int is primitive type

    public A(int number) {
        b = new B();
        c = new C();
        this.number = number;
    }

    public Object clone() throws CloneNotSupportedException {
        A copy = (A) super.clone();
        copy.b = (B) b.clone();
        copy.c = (C) c.clone();
        copy.number = number;

        return copy;
    }

    @Override
    public int compareTo(Object otherObject) throws ClassCastException {

        A other = (A) otherObject;

        if (number < other.number) {
            return -1;
        } else if (number == other.number) {
            return 0;
        } else {
            return 1;
        }
    }
}

class B implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class C implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
