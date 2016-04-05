package com.tfs.tabs_application;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.app.TabActivity;

//@SuppressWarnings("deprecation")
public  class MainActivity extends TabActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost host = (TabHost)findViewById(android.R.id.tabhost);
        TabHost.TabSpec spec = host.newTabSpec("tab1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Tab 1");
        host.addTab(spec);

        spec = host.newTabSpec("tab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Tab 2");
        host.addTab(spec);

        spec = host.newTabSpec("tab3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("tab 3");
        host.addTab(spec);

    }
}
