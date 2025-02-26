// STUDENT NAME: Muhammad Conn
// PARTNER NAME: N/A
// CS111 SECTION #: 3033
// DATE: 2/25/2025

public class Main 
{
  public static void main(String[] args) 
    {

    /***** DECLARATION SECTION *****/
	// We define the components of the test date provided, today's date, and my birth date to test the method
    int testMonth = 8;
    int testDay = 26;
    int testYear = 1918;

	int presentMonth = 2;
    int presentDay = 25;
	int presentYear = 2025;

    int birthMonth = 6;
    int birthDay = 27;
	int birthYear = 2008;
    

    /***** OUTPUT SECTION *****/
    // We print the outputs of the three test scenarios, using formatDate() to ensure we can easily see which julian day corresponds to which date
    System.out.println("The julian number for the test date, " + formatDate(testMonth, testDay, testYear) + ", is " + calcJulianDate(testMonth, testDay, testYear));
	System.out.println("The julian number for the current date, " + formatDate(presentMonth, presentDay, presentYear) + ", is " + calcJulianDate(presentMonth, presentDay, presentYear));
	System.out.println("The julian number for my birth date, " + formatDate(birthMonth, birthDay, birthYear) + ", is " + calcJulianDate(birthMonth, birthDay, birthYear));
    }

    /**Turns a normal date into a julian day number
     * @param monthToday integer for the month of the provided date
     * @param dayToday integer for the day of the provided date
     * @param yearToday integer for the year of the provided date
     * @return returns an int with the julian day number
     * @author Muhammad Conn
     */
    public static int calcJulianDate(int monthToday, int dayToday, int yearToday)
    {
        // We replicate the calculations from lab 03 using our new parameters to turn a date into a julian day number
        int julianConstant = (14 - monthToday) / 12;
        int julianMonth = monthToday + 12 * julianConstant - 3;
        int julianYear = yearToday + 4800 - julianConstant;
        int julianPresent = dayToday + (153 * julianMonth + 2) / 5 + 365 * julianYear + 
            julianYear / 4 - julianYear / 100 + julianYear / 400 - 32045;

        // We return the result of the calculation
        return(julianPresent);
    }

    /**Formats a date properly
     * @param month integer for the month of the year
     * @param day integer for the day of the year
     * @param year integer for the year
     * @return returns a string with the date including slashes between numbers
     * @author Muhammad Conn
     */
    public static String formatDate(int month, int day, int year)
        {
            return(month + "/" + day + "/" + year);
        }
}