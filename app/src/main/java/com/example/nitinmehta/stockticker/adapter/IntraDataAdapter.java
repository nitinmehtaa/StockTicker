package com.example.nitinmehta.stockticker.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nitinmehta.stockticker.R;
import com.example.nitinmehta.stockticker.models.ListItemData;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by NitinMehta on 19/01/2018.
 */

public class IntraDataAdapter extends RecyclerView.Adapter<IntraDataAdapter.MyViewHolder> {

    List<ListItemData> data;

    public IntraDataAdapter(List<ListItemData> listItemDataList) {
        data = listItemDataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ListItemData listItemData = data.get(position);
        holder.title.setText(listItemData.getTitle());
        holder.subTitle.setText(listItemData.getSubtitle());
        holder.date.setText(listItemData.getTimeData());
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView date, title, subTitle;

        public MyViewHolder(View view) {
            super(view);
            date = view.findViewById(R.id.date_time);
            title = view.findViewById(R.id.title);
            subTitle = view.findViewById(R.id.sub_title);
        }
    }

    public void setData(List<ListItemData> lid) {
        data = lid;
    }
}
