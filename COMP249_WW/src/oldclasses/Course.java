package oldclasses;

import oldclasses.BadCreditPointsException;

public class Course {

    private String title; // The title should never be empty
    private double creditPoints; // credit popints should be in [0, 4]

    public Course(String title, double creditPoints) throws Exception, BadCreditPointsException {
        if (title.equals("")) {
            throw new Exception("No empty titles please.");
        } else {
            this.title = title;
        }
        if (creditPoints < 0 || creditPoints > 4) {
            throw new BadCreditPointsException("Bad credit points.", 0, 4);
        } else {
            this.creditPoints = creditPoints;
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(double creditPoints) {
        this.creditPoints = creditPoints;
    }

    @Override
    public String toString() {
        return "Course " + this.title + " and CP " + this.creditPoints;
    }

}
