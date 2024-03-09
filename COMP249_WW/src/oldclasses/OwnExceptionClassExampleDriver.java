package oldclasses;

public class OwnExceptionClassExampleDriver {

    public static void main(String[] args) {
        Course c = null;
        try {
            c = new Course("COMP 249", -3);
        } catch (BadCreditPointsException bcpe) {
            System.out.println(bcpe.getMessage());
            System.out.println("CP should be between " + bcpe.getMinCreditPoints() + " and " + bcpe.getMaxCreditPoints());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(c);
    }

}
