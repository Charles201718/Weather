package com.example.charleswayne.weather;

/**
 * Created by charleswayne on 7/8/18.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class rss_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rss_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.rlContainer, RssFragment.newInstance("http://www.javaworld.com/index.xml"))
                .commit();
    }
}