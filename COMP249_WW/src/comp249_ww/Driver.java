package comp249_ww;

public class Driver {

    public static void main(String[] args) {

        MyInterface obj = new MyInterface() {

            @Override
            public void f() {
                System.out.println("From the anonymous class");
            }
        };

        obj.f();
    }

}

interface MyInterface {

    public void f();
}
