package comp249_ww;

public interface Interface1 {

    int size = 5; // Constant

    int[] arr = {1, 2, 3};

    // arr = anotherArray; NO
    // arr = new int[7]; NO
    // arr[0] = 70; YES
    public void display();

    default public int something() {
        // whatever code
        return 0;
    }

}
