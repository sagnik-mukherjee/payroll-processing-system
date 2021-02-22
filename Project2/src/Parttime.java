/**
 * Object class which represents a part-time worker, is of type Employee.
 @author Sagnik Mukherjee, Michael Choe
 */
public class Parttime extends Employee
{
    //object fields
    private double payRate;
    private double periodEarnings;
    private int hoursWorked;

    /**
     * Default constructor for Parttime.
     */
    public Parttime()
    {
        super();
        hoursWorked = Consts.DEFAULTHOURS;
    }

    /**
     * Parameterized constructor for Parttime.
     * @param p Profile which contains personal Parttime data
     */
    public Parttime(Profile p, double pr, String tw, int hw)
    {
        super(p, pr, tw);
        //intentionally invalidate Parttime object
        if (hw > Consts.PARTTIME_MAX) {
            Profile invalid = new Profile();
            super.setProfile(invalid);
        }
        hoursWorked = hw;
    }

    /**
     * Setting the value for the hours worked by this Parttime.
     * @param hw value to set this.hoursWorked to
     */
    public void setHoursWorked(int hw)
    {
        hoursWorked = hw;
    }

    /**
     * Getter for number of hours worked by this Parttime
     * @return int value of hours worked
     */
    public int getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Returns a message formatting the contents of Parttime object.
     * @return String literal containing Parttime field values
     */
    @Override
    public String toString()
    {
        return super.toString()
                + Consts.HOURLYPAY_MSG + Consts.df.format(payRate)
                + Consts.HOURS_MSG + hoursWorked;
    }

    /**
     * Compares all fields between two Parttime objects.
     * @param obj Object which must be of type Parttime
     * @return true if both objects have identical fields, false otherwise
     */
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Parttime))
            return false;

        return super.equals(obj);
    }

    /**
     * Determines Parttime compensation based on data fields.
     */
    @Override
    public void calculatePayment()
    {
        int overtime = hoursWorked % Consts.FULLHOURS;
        int regularTime = hoursWorked - overtime;
        double overtimeRate = Consts.OVERTIME_RATE * payRate;
        periodEarnings = (payRate * regularTime)
                + (overtimeRate * overtime);
    }
}
