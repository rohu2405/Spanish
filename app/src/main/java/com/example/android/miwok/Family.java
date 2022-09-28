package com.example.android.miwok;

public class Family {
    // Default translation of the word
    private String Default;

    // Spanish Translation of the word
    private String Spanish;

    public Family(String DefTrans , String SpanTrans) {
        Default = DefTrans;
        Spanish = SpanTrans;
    }

    // Get default translation word
    public String getDefault() {
        return Default;
    }

    // Get Spanish Translation Word
    public String getSpanish() {
        return Spanish;
    }
}
