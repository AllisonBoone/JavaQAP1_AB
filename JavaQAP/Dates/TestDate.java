//Test the Date class.
//Creates object with specific day, month, year values.
public class TestDate {
    public static void main(String[] args) {
        Date today = new Date(23, 9, 2024);

//Displays the given example date in a DD/MM/YYYY format.
    System.out.println("Today's date is: " + today.toString());

//Changing the date using the Setter methods.
    today.setDay(24);
    today.setMonth(10);
    today.setYear(2025);

//Displays the changed date using the Setter method.
    System.out.println("Updated date is: " + today.toString());
    }
}
