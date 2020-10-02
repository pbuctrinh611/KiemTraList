package com.example.designlistview;

public class ListViewBean {
    int image;
    String langName;
    String stadium;

    public ListViewBean() {
    }

    public ListViewBean(int image,String langName, String stadium) {
        super();
        this.image = image;
        this.langName=langName;
        this.stadium=stadium;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStaidum(String staidum) {
        this.stadium = stadium;
    }
}