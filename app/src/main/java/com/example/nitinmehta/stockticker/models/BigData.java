package com.example.nitinmehta.stockticker.models;

import android.test.mock.MockApplication;
import android.util.Log;

import com.google.gson.annotations.SerializedName;

import java.security.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by NitinMehta on 19/01/2018.
 */

public class BigData {
    @SerializedName("Meta Data")
    Map<String, String> metaData;

    @SerializedName("Time Series (15min)")
    Map<String, Map<String, String>> timeSeriesData;


//    public void printMetaData() {
//        printMapKeys(metaData);
//    }
//
//    public void printTimeSeriesData() {
//        Log.d("BIG-DEMO-DATA", "BIG DATA STUFF");
//        Iterator iterator = timeSeriesData.keySet().iterator();
//        while (iterator.hasNext()) {
//            String key = (String) iterator.next();
//            Map<String, String> value = timeSeriesData.get(key);
//            printMapKeys(value);
//        }
//    }

    public static void flattenMapKeysWithTitle(Map<String, String> map, String title, List<ListItemData> list) {
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            ListItemData listItemData = new ListItemData();
            listItemData.setTitle(title);
            String key = (String) iterator.next();
            String value = map.get(key);
            listItemData.setSubtitle(value);
            listItemData.setTimeData(key);
            list.add(listItemData);
        }
    }

    public Map<String,Map<String,String>> getTimeSeriesData() {
        return timeSeriesData;
    }
}
