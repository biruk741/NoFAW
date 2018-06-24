package com.innov8.nofaw.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.innov8.nofaw.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //todo: request gps permissions after login/signup.
    }
}
