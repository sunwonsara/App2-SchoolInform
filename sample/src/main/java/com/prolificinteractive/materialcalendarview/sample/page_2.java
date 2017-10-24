package com.prolificinteractive.materialcalendarview.sample;

/**
 * Created by Sun_Sun on 2017-10-19.
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class page_2 extends android.support.v4.app.Fragment{

    Button bt1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        LinearLayout linearLayout = (LinearLayout)inflater.inflate(R.layout.page, container,false);

        final LinearLayout background = (LinearLayout)linearLayout.findViewById(R.id.background);
        background.setBackgroundResource(R.drawable.slide2);

        return linearLayout;

    }
}
