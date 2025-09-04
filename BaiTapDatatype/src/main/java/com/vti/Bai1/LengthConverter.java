package com.vti.Bai1;

public class LengthConverter {
    private int inch;

    // Getter & Setter
    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }


    // Constructor
    public LengthConverter(int inch) {
        this.inch = inch;
    }

    public float meterConverter (float inch) {
        float meters =  inch * 0.0254f;
        meters = Math.round(meters * 10000f) / 10000f;
        return meters;
    }
}
