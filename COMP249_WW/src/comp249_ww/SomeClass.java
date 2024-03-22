package comp249_ww;

public class SomeClass implements Interface1 {

    // MUST HAVE
    @Override
    public void display() {
        System.out.println("Hello from SomeClass.");
    }

    // Optional, if you need it
    @Override
    public int something() {
        //super.something(); CHECK IF THIS IS POSSIBLE
        return 1;
    }

    public void blabla() {

    }
}
