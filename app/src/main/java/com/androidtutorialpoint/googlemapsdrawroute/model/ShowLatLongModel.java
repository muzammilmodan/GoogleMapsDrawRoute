package com.androidtutorialpoint.googlemapsdrawroute.model;

/**
 * Created by Mobile on 2/7/2018.
 */

public class ShowLatLongModel {

    public String getLatLongKm() {
        return latLongKm;
    }

    public void setLatLongKm(String latLongKm) {
        this.latLongKm = latLongKm;
    }

    public String getLatLongMeter() {
        return latLongMeter;
    }

    public void setLatLongMeter(String latLongMeter) {
        this.latLongMeter = latLongMeter;
    }

    public String getLatLongTotal() {
        return latLongTotal;
    }

    public void setLatLongTotal(String latLongTotal) {
        this.latLongTotal = latLongTotal;
    }

    String latLongKm;
    String latLongMeter;
    String latLongTotal;
}
