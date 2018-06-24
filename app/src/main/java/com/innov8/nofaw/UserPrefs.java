package com.innov8.nofaw;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Biruk on 6/25/2018.
 */

public class UserPrefs {
    String phoneNumber;
    String name;
    String type;
    boolean loggedIn;
    String email;
    SharedPreferences.Editor editor;
    SharedPreferences prefs;
    public UserPrefs(Context c){
        prefs = c.getSharedPreferences("user_prefs",0);
        editor = prefs.edit();
    }

    public String getPhoneNumber() {
        return prefs.getString("phoneNumber","");
    }

    public void setPhoneNumber(String phoneNumber) {
       editor.putString("phoneNumber",phoneNumber);
       editor.apply();
    }

    public String getName() {
        return prefs.getString("name","");
    }

    public void setName(String name) {
        editor.putString("name",name);
        editor.apply();
    }

    public String getType() {
        return prefs.getString("type","farmer");
    }

    public void setType(String type) {
        editor.putString("type",type);
        editor.apply();
    }

    public boolean isLoggedIn() {
        return prefs.getBoolean("loggedin",false);
    }

    public void setLoggedIn(boolean loggedIn) {
        editor.putBoolean("loggedin",loggedIn);
        editor.apply();
    }

    public String getEmail() {
        return prefs.getString("email","");

    }

    public void setEmail(String email) {
        editor.putString("email",email);
        editor.apply();
    }
}
