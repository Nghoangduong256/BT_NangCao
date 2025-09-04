package com.vti.Bai2;

public class TimeConverter {
    private int minutes;

    // Getter & Setter
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    // Contructor
    public TimeConverter(int minutes) {
        this.minutes = minutes;
    }

    // Methods
    public int[] dayYearConverter () {
        int years = this.minutes / 525600;
        int days = this.minutes % 525600 / 1440;
        int[] dayYear = {years, days};
        return dayYear;
    }
}
