package oldclasses;

public class Student extends Person {

    private String programOfStudy;
    private double gpa;

    public Student(String name, int age, Address address,
            String programOfStudy, double gpa) {
        super(name, age, address);
        this.programOfStudy = programOfStudy;
        this.gpa = gpa;
    }

    public Student(Student otherStudent) {
        this(otherStudent.name, otherStudent.age, new Address(otherStudent.address), otherStudent.programOfStudy, otherStudent.gpa);
    }

    // Getters
    public String getProgramOfStudy() {
        return this.programOfStudy;
    }

    public double getGPA() {
        return this.gpa;
    }

    // Setters
    public void setProgramOfStudy(String programOfStudy) {
        this.programOfStudy = programOfStudy;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {

        return super.toString() + " Student " + this.name + " is studying " + this.programOfStudy;
    }

    @Override
    public boolean equals(Object otherObject) {
        // Check if the parameter is null (else, return false)
        if (otherObject == null) {
            return false;
        }

        // Check if parameter is of this class type (else, return false)
        // IMPORTANT: do not use instanceof in equals
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }

        // Do the comparison (based on GPA)
        Student otherStudent = (Student) otherObject;
        if (this.programOfStudy.equals(otherStudent.programOfStudy) && this.gpa == otherStudent.gpa) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected Student clone() {
        return new Student(this);
    }

    @Override
    public void f() {
        System.out.println("This is from STudent.");
    }

    @Override
    public void g() {

    }
}
