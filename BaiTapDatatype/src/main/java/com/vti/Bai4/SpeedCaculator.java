package com.vti.Bai4;

public class SpeedCaculator {
    private int distance;   //(m)
    private int hour;
    private int minutes;
    private int seconds;

    // Constructor
    public SpeedCaculator(int distance, int hour, int minutes, int seconds) {
        this.distance = distance;
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Getter & Setter
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    //Methods
    public void speedCaculator() {
        float meterPerSec = (float) this.distance / (this.hour * 3600 + this.minutes * 60 + this.seconds);
        float kilometerPerHour = meterPerSec * 3.6f; // 1km/h = 1m/s * 3.6
        System.out.println("Vận tốc m/s: " + meterPerSec);
        System.out.println("Vận tốc km/h: " + kilometerPerHour);
    }
}
