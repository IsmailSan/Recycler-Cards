package com.example.imansamiaji.recyclercards;

public class Exampleitem {
    private int mImageResource;
    private String mText;

    public Exampleitem(int imageResource,String text) {
        mImageResource= imageResource;
        mText=text;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText() {
        return mText;
    }
}
