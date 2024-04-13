package comp249_ww;

public class Car {

    private int numberOfPassengers;
    private int numberOfWheels;

    public Car(int numberOfPassengers, int numberOfWheels) {
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

}
