package com.androidtutorialpoint.googlemapsdrawroute.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidtutorialpoint.googlemapsdrawroute.R;
import com.androidtutorialpoint.googlemapsdrawroute.model.SaveLatLong;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Mobile on 2/7/2018.
 */

public class ShowAllLatLongAdapter extends RecyclerView.Adapter<ShowAllLatLongAdapter.MyViewHolder> {

    private List<SaveLatLong> latLongList;

    public ShowAllLatLongAdapter(List<SaveLatLong> latLongList) {
        this.latLongList = latLongList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.show_all_distance, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        try {
            SaveLatLong latLong = latLongList.get(position);
            Log.e("latLong ====", "::" + latLongList.get(position));
            Log.e("latLong ====", "Convert ::" + String.valueOf(latLong.getSaveLatLongKm()));

            Collections.sort(latLongList, new Comparator<SaveLatLong>() {
                @Override
                public int compare(SaveLatLong lhs, SaveLatLong rhs) {
                    // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                    return lhs.getSaveLatLongKm() > rhs.getSaveLatLongKm() ? -1 :
                            (lhs.getSaveLatLongKm() < rhs.getSaveLatLongKm()) ? 1 : 0;
                }
            });

//            Collections.sort(latLongList, SaveLatLong.shortShowLatLong);
//            for (SaveLatLong strLatLong : latLongList) {
                holder.txtVwLatLongKm.setText(String.valueOf(latLong.getSaveLatLongKm()));
//            }

            holder.txtVwLatLongMeter.setText(String.valueOf(latLong.getSaveLatLongMeter()));
            holder.txtVwLatLongTotal.setText(String.valueOf(latLong.getSaveTotalDistance()));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return latLongList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txtVwLatLongKm, txtVwLatLongTotal, txtVwLatLongMeter;

        private MyViewHolder(View view) {
            super(view);
            txtVwLatLongKm = (TextView) view.findViewById(R.id.txtVwLatLongKm);
            txtVwLatLongMeter = (TextView) view.findViewById(R.id.txtVwLatLongMeter);
            txtVwLatLongTotal = (TextView) view.findViewById(R.id.txtVwLatLongTotal);
        }
    }


}
