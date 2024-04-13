package comp249_ww;

import java.util.Comparator;

public class CarComparatorBasedOnNumOfPassengers implements Comparator<Car> {

    @Override
    public int compare(Car c1, Car c2) {

        //Integer.compare(c1.getNumberOfPassengers(), c2.getNumberOfPassengers());
        if (c1.getNumberOfPassengers() < c2.getNumberOfPassengers()) {
            return -1;
        } else if (c1.getNumberOfPassengers() == c2.getNumberOfPassengers()) {
            return 0;
        } else {
            return 1;
        }
    }

}
