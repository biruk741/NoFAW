package com.innov8.nofaw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ExplainerActivity extends AppCompatActivity {

    String title = "";
    String json = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainer);
        title = getIntent().getStringExtra("title");
        json = getIntent().getStringExtra("json");

    }
}
