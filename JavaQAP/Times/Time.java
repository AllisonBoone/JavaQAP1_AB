package Times;
//Attribute for storing hours, minutes, seconds.
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

//Constructor that initializes hours, minutes, seconds.
    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

//Getter method for hours.
    public int getHours(){
        return this.hours;
    }

//Setter method for hours.
    public void setHours(int hours){
        this.hours = hours;
    }

//Getter method for minutes.
    public int getMinutes(){
         return this.minutes;
}

//Setter method for minutes.
    public void setMinutes(int minutes){
         this.minutes = minutes;
}

//Getter method for seconds.
    public int getSeconds(){
         return this.seconds;
}

//Setter method for seconds.
    public void setSeconds(int seconds){
         this.seconds = seconds;
}

//Method to increase time by 1 second.
    public void nextSecond(){
        this.seconds++;
        if(this.seconds == 60){
            this.seconds = 0;
            this.minutes++;
            if(this.minutes == 60){
                this.minutes = 0;
                this.hours++;
                if(this.hours == 24){
                    this.hours = 0;
                }
            }
        }
    }

//Method to decrease time by 1 second.
    public void previousSecond(){
        this.seconds--;
        if(this.seconds == -1){
            this.seconds = 59;
            this.minutes--;
            if(this.minutes == -1){
                this.minutes = 59;
                this.hours--;
                if(this.hours == -1){
                    this.hours = 23;
                }
            }
        }
    }
//Method to display time in HH:MM:SS format.
    public String toString(){
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
