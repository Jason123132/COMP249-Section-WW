package comp249_ww;

import java.util.Comparator;

public class CarComparatorBasedOnNumOfWheels implements Comparator<Car> {

    @Override
    public int compare(Car c1, Car c2) {
        if (c1.getNumberOfWheels() < c2.getNumberOfWheels()) {
            return -1;
        } else if (c1.getNumberOfWheels() == c2.getNumberOfWheels()) {
            return 0;
        } else {
            return 1;
        }
    }
}
