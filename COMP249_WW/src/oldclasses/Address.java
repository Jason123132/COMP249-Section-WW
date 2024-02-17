package oldclasses;

public class Address {

    private int streetNumber;
    private String streetName;
    private String cityName;

    public Address(int streetNumber, String streetName, String cityName) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.cityName = cityName;
    }

    public Address(Address otherAddress) {
        this(otherAddress.streetNumber, otherAddress.streetName, otherAddress.cityName);
    }

    public Address() {
        this(0, "", "");
    }

    // Getters
    public int getStreetNumber() {
        return this.streetNumber;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public String getCityName() {
        return this.cityName;
    }

    // Setters
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return this.streetNumber + " " + this.streetName + " " + this.cityName;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (this.getClass() != otherObject.getClass()) {
            return false;
        } else {
            Address otherPerson = (Address) otherObject;
            if (this.streetNumber == otherPerson.streetNumber) {
                return true;
            } else {
                return false;
            }
        }
    }
}
