package comp249_ww;

public class Driver {

    public static void main(String[] args) {

        final int ARRAY_SIZE = 3;
        Shape[] myShapes = new Shape[ARRAY_SIZE];

        myShapes[0] = new Triangle("T1", 3, 7, 5);
        myShapes[1] = new Circle("C1", 2.5);
        myShapes[2] = new Rectangle("R1", 5, 9);

        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.println(myShapes[i].getPerimeter()); // Dynamic binding
        }

        // Enhanced loop (foreach loop)
        for (Shape s : myShapes) {
            System.out.println(s.getPerimeter());
        }

    }
}
