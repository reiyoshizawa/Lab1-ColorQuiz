package com.example.yoshizawarei.lab1;

public class Color {

    private int color;
    private String colorName;

    public Color(int color, String colorName) {
        this.color = color;
        this.colorName = colorName;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
