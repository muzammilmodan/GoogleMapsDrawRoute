package com.androidtutorialpoint.googlemapsdrawroute.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.androidtutorialpoint.googlemapsdrawroute.R;
import com.androidtutorialpoint.googlemapsdrawroute.adapter.ShowAllLatLongAdapter;
import com.androidtutorialpoint.googlemapsdrawroute.model.SaveLatLong;

import java.util.ArrayList;
import java.util.List;

public class ShowAllLatLongActivity extends AppCompatActivity {

    RecyclerView rclrVwShowLatLong;
    List<SaveLatLong> arrLstAllLatLong = new ArrayList<>();
    ShowAllLatLongAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_lat_long);

        arrLstAllLatLong = (ArrayList<SaveLatLong>) getIntent().getSerializableExtra("AllLatLong");
        Log.e("Receive Array size ", "===>" + arrLstAllLatLong.size());

        rclrVwShowLatLong = findViewById(R.id.rclrVwShowLatLong);
        setLatLongData();
    }

    private void setLatLongData() {

        try {
            Log.e("arrLstAllLatLong ===", ">>>" + arrLstAllLatLong.size());

            mAdapter = new ShowAllLatLongAdapter(arrLstAllLatLong);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            rclrVwShowLatLong.setLayoutManager(mLayoutManager);
            rclrVwShowLatLong.setItemAnimator(new DefaultItemAnimator());
            rclrVwShowLatLong.setAdapter(mAdapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
