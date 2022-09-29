package com.example.android.miwok;

public class Family {
    // Default translation of the word
    private String Default;

    // Spanish Translation of the word
    private String Spanish;

    private int FamilyResId;

    public Family(String DefTrans , String SpanTrans) {
        Default = DefTrans;
        Spanish = SpanTrans;
    }

    public Family(String DefTrans , String SpanTrans , int GetFamilyId) {
        Default = DefTrans;
        Spanish = SpanTrans;
        FamilyResId = GetFamilyId;
    }

    // Get default translation word
    public String getDefault() {
        return Default;
    }

    // Get Spanish Translation Word
    public String getSpanish() {
        return Spanish;
    }

    public int getFamilyResId() { return FamilyResId;}
}
