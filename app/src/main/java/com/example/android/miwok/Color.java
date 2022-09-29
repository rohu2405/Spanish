package com.example.android.miwok;

public class Color {
    // Default translation of the word
    private String Default;

    // Spanish Translation of the word
    private String Spanish;
    private int ColorResId;

    public Color(String DefTrans , String SpanTrans) {
        Default = DefTrans;
        Spanish = SpanTrans;
    }

    public Color(String DefTrans , String SpanTrans , int GetColor) {

        Default = DefTrans;
        Spanish = SpanTrans;
        ColorResId = GetColor;
    }

    // Get default translation word
    public String getDefault() {
        return Default;
    }

    // Get Spanish Translation Word
    public String getSpanish() {
        return Spanish;
    }

    public int getColorResId() {return ColorResId;}
}

