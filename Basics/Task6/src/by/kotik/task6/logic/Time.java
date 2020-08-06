package by.kotik.task6.logic;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHours() {
        if (hours > 24 || hours < 0) {
            hours = 0;
        }

        return hours;
    }

    public int getMinutes() {
        if (minutes > 59 || minutes < 0) {
            minutes = 0;
        }
        return minutes;
    }

    public int getSeconds() {
        if (seconds > 59 || seconds < 0) {
            seconds = 0;
        }

        return seconds;
    }

    public void editHours(int userHours, String userChoice) {
        if (userChoice.equals("+")) {
            hours += userHours;
        } else if (userChoice.equals("-")) {
            hours -= userHours;
        } else {
            System.out.println("Error");
        }
    }

    public void editMinutes(int userMinutes, String userChoice) {
        if (userChoice.equals("+")) {
            minutes += userMinutes;
        } else if (userChoice.equals("-")) {
            minutes -= userMinutes;
        } else {
            System.out.println("Error!");
        }
    }

    public void editSeconds(int userSeconds, String userChoice) {
        if (userChoice.equals("+")) {
            seconds += userSeconds;
        } else if (userChoice.equals("-")){
            seconds -= userSeconds;
        } else {
            System.out.println("Error!");
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
