package com.example.nitinmehta.stockticker;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by NitinMehta on 17/01/2018.
 */

public class IntradayList {
    @SerializedName("Meta Data")
    @Expose
    private ArrayList<IntradayData> metaData = new ArrayList<>();

    public ArrayList<IntradayData> getMetaData() {
        return metaData;
    }

    public void setMetaData(ArrayList<IntradayData> metaData) {
        this.metaData = metaData;
    }
}
