package oldclasses;

public class BadCreditPointsException extends Exception {

    private double minCreditPoints;
    private double maxCreditPoints;

    public BadCreditPointsException(String message, double min, double max) {
        super(message);
        this.minCreditPoints = min;
        this.maxCreditPoints = max;
    }

    public double getMinCreditPoints() {
        return minCreditPoints;
    }

    public double getMaxCreditPoints() {
        return maxCreditPoints;
    }

}
