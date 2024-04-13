package comp249_ww;

import java.util.ArrayList;
import java.util.Collections;
import oldclasses.OurCLinkedList;

public class Driver {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        Collections.sort(cars, new CarComparatorBasedOnNumOfPassengers());

        // Do something with the sorted array list
        Collections.sort(cars, new CarComparatorBasedOnNumOfWheels());

    }

}
