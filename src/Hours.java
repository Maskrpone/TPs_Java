public class Hours {
    final private int hours;
    final private int minutes;
    final private int seconds;

    public Hours() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }
    public Hours(int hours, int minutes, int seconds) {
        if ((seconds % 60) != seconds) {
            minutes++;
            seconds -= 60;
        }
        if ((minutes % 60) != minutes) {
            hours++;
            minutes -= 60;
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Hours(double value) {
        this.hours = (int)Math.floor(value);
        value -= this.hours;

        value *= 60;
        this.minutes = (int)Math.floor(value);
        value -= this.minutes;

        value *= 60;
        this.seconds = (int)Math.floor(value);
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public double getDecimal() {
        return (this.hours + (this.minutes / 60.0) + (this.seconds / 3600.0));
    }

    public void checkInfos() {
        System.out.println("Hours : " + this.getHours());
        System.out.println("Minutes : " + this.getMinutes());
        System.out.println("Seconds : " + this.getSeconds());
        System.out.println("Decimals : " + this.getDecimal());
        System.out.println("---------------------------------");
    }

}
