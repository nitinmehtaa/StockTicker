package com.example.nitinmehta.stockticker.models;

/**
 * Created by NitinMehta on 19/01/2018.
 */

public class ListItemData {
    private String title;

    private String subtitle;

    private String timeData;

    public ListItemData() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTimeData() {
        return timeData;
    }

    public void setTimeData(String timeData) {
        this.timeData = timeData;
    }
}
