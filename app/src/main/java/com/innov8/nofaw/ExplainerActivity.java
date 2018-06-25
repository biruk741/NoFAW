package com.innov8.nofaw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.innov8.nofaw.CustomClasses.CustomMethods;

import org.json.JSONException;

import butterknife.BindView;

public class ExplainerActivity extends AppCompatActivity {

    String title = "";
    String json = "";
    @BindView(R.id.explainerLinear)
    LinearLayout linearLayout;
    @BindView(R.id.explainertitle)
    TextView explainerTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainer);
        title = getIntent().getStringExtra("title");


        explainerTitle.setText(title);
        try {
            CustomMethods.inflateViews(CustomMethods.loadJSONFromAsset(title),this);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
