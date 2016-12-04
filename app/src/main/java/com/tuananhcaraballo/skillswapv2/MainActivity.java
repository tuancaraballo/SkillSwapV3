package com.tuananhcaraballo.skillswapv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabs = (TabHost)findViewById(R.id.tabHost);
        tabs.setup();
        TabHost.TabSpec tab1 = tabs.newTabSpec("Tab 1");
        tab1.setContent(R.id.layout1);
        tab1.setIndicator("",getResources().getDrawable(R.drawable.network_text));
        tabs.addTab(tab1);

        TabHost.TabSpec tab2 = tabs.newTabSpec("Tab 2");
        tab2.setContent(R.id.layout2);
        tab2.setIndicator("",getResources().getDrawable(R.drawable.notify_text));
        tabs.addTab(tab2);

        TabHost.TabSpec tab3 = tabs.newTabSpec("Tab 3");
        tab3.setContent(R.id.layout3);
        tab3.setIndicator("",getResources().getDrawable(R.drawable.search_text));
        tabs.addTab(tab3);

        TabHost.TabSpec tab4 = tabs.newTabSpec("Tab 4");
        tab4.setContent(R.id.layout4);
        tab4.setIndicator("",getResources().getDrawable(R.drawable.message_text));
        tabs.addTab(tab4);

        TabHost.TabSpec tab5 = tabs.newTabSpec("Tab 5");
        tab5.setContent(R.id.layout5);
        tab5.setIndicator("",getResources().getDrawable(R.drawable.profile_text));
        tabs.addTab(tab5);



        tabs.setCurrentTab(0);


    }
}
