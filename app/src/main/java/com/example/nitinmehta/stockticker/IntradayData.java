package com.example.nitinmehta.stockticker;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by NitinMehta on 17/01/2018.
 */

public class IntradayData {

    @SerializedName("1. Information")
    @Expose
    private String information;

    @SerializedName("2. Symbol")
    @Expose
    private String symbol;

    @SerializedName("3. Last Refreshed")
    @Expose
    private String lastRefreshed;

    @SerializedName("4. Interval")
    @Expose
    private String interval;

    @SerializedName("5. Output Size")
    @Expose
    private String outputSize;

    @SerializedName("6. Time Zone")
    @Expose
    private String timeZone;


    //getter
    public String getInformation() {
        return information;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getLastRefreshed() {
        return lastRefreshed;
    }

    public String getInterval() {
        return interval;
    }

    public String getOutputSize() {
        return outputSize;
    }

    public String getTimeZone() {
        return timeZone;
    }

    //setter
    public void setInformation(String information) {
        this.information = information;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setLastRefreshed(String lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public void setOutputSize(String outputSize) {
        this.outputSize = outputSize;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
