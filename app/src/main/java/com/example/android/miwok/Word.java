package com.example.android.miwok;

import android.view.View;

public class Word  {
    // Default translation of the word
    private String Default;

    // Spanish Translation of the word
    private String Spanish;
    private int imageResId;

    public Word(String DefTrans , String SpanTrans) {
        Default = DefTrans;
        Spanish = SpanTrans;
    }

    public Word(String DefTrans , String SpanTrans , int GetImage) {
        Default = DefTrans;
        Spanish = SpanTrans;
        imageResId = GetImage;
    }

    // Get default translation word
    public String getDefault() {
        return Default;
    }

    // Get Spanish Translation Word
    public String getSpanish() {
        return Spanish;
    }

    public int getImageResId() {return imageResId;}

}
