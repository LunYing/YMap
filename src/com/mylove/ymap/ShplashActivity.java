package com.mylove.ymap;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ShplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.shplash, menu);
        return true;
    }
    
}
