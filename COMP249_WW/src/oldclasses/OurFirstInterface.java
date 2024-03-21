package oldclasses;

public interface OurFirstInterface {

    int x = 10;

    int[] y = {5, 4, 7};

    public int method1(int n);

    default public void method2() {
        // something
    }

}
