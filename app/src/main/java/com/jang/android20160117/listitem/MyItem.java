package com.jang.android20160117.listitem;

/**
 * Created by jang on 16. 1. 17.
 */
public class MyItem {
    private String mTitle;
    private String mContent;

    public MyItem(){
        mTitle = "Default Title";
        mContent = "Default Description";
    }

    public MyItem(String title, String content) {
        mTitle = title;
        mContent = content;
    }

    private void setTitle(String title){ mTitle = title; }
    private void setContent(String content){ mContent = content; }
    public String getTitle() { return mTitle; }
    public String getContent() {return mContent; }
}
