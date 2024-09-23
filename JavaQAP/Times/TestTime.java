package Times;
//Test the Time class.
//Creates 2 time objects.
public class TestTime {
    public static void main(String[] args){
        Time time1 = new Time(17, 35, 54);
        Time time2 = new Time(5, 53, 27);

//Displays the initial times of time1 and time2.
        System.out.println("Initial time of time1: " + time1.toString());

        System.out.println("Initial time of time2: " + time2.toString());

//Increases time1 by 1 second.
        time1.nextSecond();

//Decreases time2 by 1 second.
        time2.previousSecond();

//Displays time1 and time2 after the 1 second increase to time1 and the 1 second decrease for time2. 
        System.out.println("Time of time1 after nextSecond(): " + time1.toString());

        System.out.println("Time of time2 after previousSecond(): " + time2.toString());
    }
    
}
