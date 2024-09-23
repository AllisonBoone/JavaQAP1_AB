//Attribute to store day, month, year.
public class Date {
    private int day;
    private int month;
    private int year;

//Constructor this initializes day, month, year.
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

//Getter method for day.
    public int getDay(){
        return this.day;
    }

//Setter method for day.
    public void setDay(int day){
        this.day = day;
    } 

//Getter method for month.
    public int getMonth(){
        return this.month;
    }

//Setter method for month.
    public void setMonth(int month){
        this.month = month;
    }

//Getter method for year.
    public int getYear(){
        return this.year;
    }

//Setter method for year.
    public void setYear(int year){
        this.year = year;
    } 

//Method to display date in a DD/MM/YYYY format.
    public String toString(){
        return String.format("%02d/%02d/%4d", day, month, year);
    }
}
