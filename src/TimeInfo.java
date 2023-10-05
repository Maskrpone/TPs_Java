public class TimeInfo {
    private int hours;
    private int minutes;
    private int day;
    private int month;
    private int year;

    public TimeInfo() {
        this.hours = 0;
        this.minutes = 0;
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public TimeInfo(int hours, int minutes, int day, int month, int year) {
        this.hours = hours;
        this.minutes = minutes;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    final public int getHours() {
        return this.hours;
    }

    final public int getMinutes() {
        return this.minutes;
    }

    final public int getDay() {
        return this.day;
    }

    final public int getMonth() {
        return this.month;
    }

    final public int getYear() {
        return this.year;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void checkInfos() {
        System.out.println("Hours: " + this.hours);
        System.out.println("Minutes: " + this.minutes);
        System.out.println("Day: " + this.day);
        System.out.println("Month: " + this.month);
        System.out.println("Year: " + this.year);
        System.out.println("-----------------");
    }
}

