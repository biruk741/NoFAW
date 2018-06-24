package com.innov8.nofaw;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Biruk on 6/25/2018.
 */

public class CustomMethods {
    public static void makeEditTextsAvenir(Activity a,int... edittexts){
        final String asset = "fonts/avenir.ttf";
        for (int res: edittexts ) {
            ((EditText)a.findViewById(res))
                    .setTypeface(
                            Typeface.createFromAsset(a.getAssets(),asset)
                    );
        }
    }
}
