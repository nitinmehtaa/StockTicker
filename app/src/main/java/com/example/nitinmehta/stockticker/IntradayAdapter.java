package com.example.nitinmehta.stockticker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by NitinMehta on 17/01/2018.
 */

public class IntradayAdapter extends BaseAdapter {

    private Context mContext;
    private List<IntradayData> mIntradayData;

    //Constructor
    public IntradayAdapter(Context mContext, List<IntradayData> mIntradayData) {
        this.mContext = mContext;
        this.mIntradayData = mIntradayData;
    }


    @Override
    public int getCount() {
        return mIntradayData.size();
    }

    @Override
    public Object getItem(int position) {
        return mIntradayData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(mContext, R.layout.intraday_info_view, null);

        TextView txtInformation = (TextView)v.findViewById(R.id.info_txt_information);
        TextView txtInformationData = (TextView)v.findViewById(R.id.info_information_data);

        TextView txtSymbol = (TextView)v.findViewById(R.id.info_txt_symbol);
        TextView txtSymbolData = (TextView)v.findViewById(R.id.info_symbol_data);

        TextView txtLastRefreshed = (TextView)v.findViewById(R.id.info_txt_last_refreshed);
        TextView txtLastRefreshedData = (TextView)v.findViewById(R.id.info_last_refreshed_data);

        TextView txtInterval = (TextView)v.findViewById(R.id.info_txt_interval);
        TextView txtIntervalData = (TextView)v.findViewById(R.id.info_last_interval_data);

        TextView txtOutputSize = (TextView)v.findViewById(R.id.info_txt_output_size);
        TextView txtOutputSizeData = (TextView)v.findViewById(R.id.info_output_size_data);

        TextView txtTimeZone = (TextView)v.findViewById(R.id.info_txt_time_zone);
        TextView txtTimeZonData = (TextView)v.findViewById(R.id.info_time_zone_data);

        txtInformationData.setText(String.valueOf(mIntradayData.get(position).getInformation()));




        return null;
    }
}
