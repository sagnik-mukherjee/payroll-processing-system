/**
 * The Consts class houses all immutable constant values.
 @author Michael Choe, Sagnik Mukherjee
 */
@SuppressWarnings("WeakerAccess")
public class Consts
{
    /* Company() class constants */


    /* Date() class constants - reused from Project1 */
    public static final int INVALID = -1;
    //Used to determine if given date is leap year.
    public static final int QUADRENNIAL = 4;
    public static final int CENTURY = 100;
    public static final int QUARTERCENTENNIAL = 400;
    //Used to determine max amount of days given month should have.
    public static final int ALTMAXDAYS = 30;
    public static final int FEBDAYSLEAP = 29;
    public static final int FEBDAYS = 28;
    public static final int DEFAULTMAXDAYS = 31;
    //Used to represent earliest year possible for a given Date object.
    public static final int YEARMIN = 1900;

    /* Employee() class constants */
    public static final int PAYPERIODS = 26;


    /* Fulltime() class constants */


    /* Management() class constants */
    public static final double MANAGER_BONUS = 192.31;
    public static final double DEPHEAD_BONUS = 365.38;
    public static final double DIRECTOR_BONUS = 461.54;
    public static final int MA_CODE = 1;
    public static final int DH_CODE = 2;
    public static final int DI_CODE = 3;



    /* Parttime() class constants */
    public static final int FULLHOURS = 80;
    public static final double OVERTIME_RATE = 1.50;
    public static final String HOURLYPAY_MSG = "::Hourly Rate $";


    /* PayrollProcessing() class constants - Client */


    /* Profile() class constants */



    /**
     * Constructor prevents other classes from instantiating objects of
     * type Consts when calling this class.
     */
    private Consts()
    {
        throw new AssertionError();
    }
}