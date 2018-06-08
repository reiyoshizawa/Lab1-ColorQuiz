package com.example.yoshizawarei.lab1;

import java.util.ArrayList;

public class ButtonLeftArray {

    private ArrayList<Color> colorArr;

    public ButtonLeftArray() {
        colorArr = new ArrayList<>();
        colorArr.add(new Color(android.graphics.Color.BLACK, "BLACK"));
        colorArr.add(new Color(android.graphics.Color.BLUE, "BLUE"));
        colorArr.add(new Color(android.graphics.Color.CYAN, "CYAN"));
        colorArr.add(new Color(android.graphics.Color.GRAY, "GRAY"));
        colorArr.add(new Color(android.graphics.Color.GREEN, "GREEN"));
        colorArr.add(new Color(android.graphics.Color.MAGENTA, "MAGENTA"));
        colorArr.add(new Color(android.graphics.Color.RED, "RED"));
        colorArr.add(new Color(android.graphics.Color.WHITE, "WHITE"));
        colorArr.add(new Color(android.graphics.Color.YELLOW, "YELLOW"));
        colorArr.add(new Color(android.graphics.Color.LTGRAY, "LTGRAY"));
    }

    public ArrayList<Color> getColorArr() {
        return colorArr;
    }

    public void setColorArr(ArrayList<Color> colorArr) {
        this.colorArr = colorArr;
    }
}
