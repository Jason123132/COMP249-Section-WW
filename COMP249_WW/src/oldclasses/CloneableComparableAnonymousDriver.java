package oldclasses;

public class CloneableComparableAnonymousDriver {

    public static void main(String[] args) {

        X obj = new X() {
            @Override
            public void f() {
                System.out.println("From anonymous.");
            }
        };

        obj.f();

        //lmb.f();
        A a1 = new A(5);
        A a2 = new A(10);

        try {
            //a1.compareTo(new C());
            System.out.println(a1.compareTo(a2));
        } catch (ClassCastException ccex) {
            System.out.println("The object passed to compareTo is not from A.");
        }
//        try {
//            A a2 = (A) a1.clone();
//
//            System.out.println(a1.getNumber());
//            System.out.println(a2.getNumber());
//        } catch (CloneNotSupportedException cnsex) {
//            System.out.println("Clone is not supported.");
//        }
    }
}

interface X {

    public void f();
}

class A implements Cloneable, Comparable {

    private B b;
    private C c;
    private int number;

    public A(int number) {
        b = new B();
        c = new C();
        this.number = number;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        A x = (A) super.clone();

        x.b = (B) b.clone();
        x.c = (C) c.clone();
        x.number = number;

        return x;
    }

    @Override
    public int compareTo(Object other) {

        A obj = (A) other;

        if (this.number < obj.number) {
            return -1;
        } else if (this.number == obj.number) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getNumber() {
        return this.number;
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

class Outer {

    private int x;

    public void f() {
        Inner a = new Inner();
        int z = a.y;
    }

    public class Inner {

        private int y;

        public void g() {
            int k = x;

        }

        private class Inner2 {

        }
    }
}
