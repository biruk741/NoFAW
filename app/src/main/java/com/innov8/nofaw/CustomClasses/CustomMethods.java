package com.innov8.nofaw.CustomClasses;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.EditText;

import com.innov8.nofaw.Pojos.Report;

import java.util.ArrayList;

/**
 * Created by Biruk on 6/25/2018.
 */

public class CustomMethods {
    public static void makeEditTextsAvenir(Activity a, int... edittexts) {
        final String asset = "fonts/avenir.ttf";
        for (int res : edittexts) {
            ((EditText) a.findViewById(res))
                    .setTypeface(
                            Typeface.createFromAsset(a.getAssets(), asset)
                    );
        }
    }

    public static double[] getLongtitudeAndLatitude(Context c) {
        LocationManager lm = (LocationManager) c.getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(c, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(c, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            double longitude = location.getLongitude();
            double latitude = location.getLatitude();
            return new double[]{longitude,latitude};
        }
        else{
            return new double[]{0,0};
        }
    }
    public static double[] calculateCoordinateMiddle(ArrayList<Report> reports){
        double longs = 0;
        double lats = 0;
        int length = 0;
        for(Report report : reports){
            length++;
            longs+=Double.parseDouble(report.getLongtitude());
            lats+=Double.parseDouble(report.getLatitude());
        }
        return new double[]{longs/length,lats/length};
    }
}
