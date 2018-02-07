package com.androidtutorialpoint.googlemapsdrawroute.model;

import java.io.Serializable;

/**
 * Created by Mobile on 2/7/2018.
 */

public class SaveLatLong implements Serializable {

    public double getSaveLatLongKm() {
        return saveLatLongKm;
    }

    public void setSaveLatLongKm(double saveLatLongKm) {
        this.saveLatLongKm = saveLatLongKm;
    }

    public double getSaveLatLongMeter() {
        return saveLatLongMeter;
    }

    public void setSaveLatLongMeter(double saveLatLongMeter) {
        this.saveLatLongMeter = saveLatLongMeter;
    }

    public double getSaveTotalDistance() {
        return saveTotalDistance;
    }

    public void setSaveTotalDistance(double saveTotalDistance) {
        this.saveTotalDistance = saveTotalDistance;
    }

    private double saveLatLongKm;
    private double saveLatLongMeter;
    private double saveTotalDistance;


//    /*Comparator for sorting the list by roll no*/
//    public static Comparator<SaveLatLong> shortShowLatLong = new Comparator<SaveLatLong>() {
//
//        public int compare(SaveLatLong s1, SaveLatLong s2) {
//
//            int rollno1 = (int) s1.getSaveLatLongKm();
//            int rollno2 = (int) s2.getSaveLatLongKm();
//
//	   /*For ascending order*/
//            return rollno1 - rollno2;
//
//	   /*For descending order*/
//            //rollno2-rollno1;
//        }
//    };


}
