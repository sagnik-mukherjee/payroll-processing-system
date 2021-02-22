import java.text.DecimalFormat;
/**
 * Object class which represents a full-time worker, is of type Fulltime.
 @author Sagnik Mukherjee, Michael Choe
 */
public class Fulltime extends Employee
{
    // object fields
    private double payRate;

    /**
     * Default constructor for Fulltime.
     */
    public Fulltime()
    {
        super();
    }

    /**
     * Parameterized constructor for Fulltime.
     * @param p Profile which contains personal Fulltime data
     */
    public Fulltime(Profile p, double pr, String tw)
    {
        super(p, pr, tw);
    }

    /**
     * Returns a message formatting the contents of Fulltime object.
     * @return String literal containing Fulltime field values
     */
    @Override
    public String toString()
    {
        return super.toString()
                + Consts.SALARY_MSG + Consts.df.format(payRate);
    }

    /**
     * Compares all fields between two Fulltime objects.
     * @param obj Object which must be of type Fulltime
     * @return true if both objects have identical fields, false otherwise
     */
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Fulltime))
            return false;

        return super.equals(obj);
    }

    /**
     * Determines Fulltime compensation based on data fields.
     */
    @Override
    public void calculatePayment()
    {
        super.calculatePayment();
    }
}
