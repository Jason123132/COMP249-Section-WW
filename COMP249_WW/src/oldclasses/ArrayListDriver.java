package oldclasses;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDriver {

    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<>(5);

        myArrayList.add(5);
        myArrayList.add(0, 7);
        myArrayList.add(-3);

        //for (String s : myArrayList) {
        //    System.out.println(s);
        //}
        Collections.sort(myArrayList);

        for (Integer s : myArrayList) {
            System.out.println(s);
        }
    }
}
