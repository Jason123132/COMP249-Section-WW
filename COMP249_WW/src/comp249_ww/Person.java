package comp249_ww;

public class Person {

    // Data attributes
    String name;
    private int age;
    private Address address;

    // Constructors
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age, int streetNumber,
            String streetName, String cityName) {
        this(name, age, new Address(streetNumber, streetName, cityName));
    }

    public Person(String name, int age) {
        this(name, age, new Address());
    }

    /*
    public Person() {
        this("blabla", 0);
    }
     */
    public Person(Person otherPerson) {
        this(otherPerson.name, otherPerson.age,
                new Address(otherPerson.address)); // Deep copy
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Address getAddress() {
        return new Address(this.address);
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;

    }

    public void setAdress(Address address) {
        this.address = address;
    }

    // toString
    @Override
    public String toString() {
        return "My name is " + this.name + " and my age is " + this.age;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (this.getClass() != otherObject.getClass()) {
            return false;
        } else {
            Person otherPerson = (Person) otherObject;
            if (this.address == otherPerson.address) {
                return true;
            } else {
                return false;
            }
        }
    }

    public int toInt() {
        return this.age;
    }

    public void f() {
        System.out.println("This is from Person");
    }

    private void g() {

    }

}
