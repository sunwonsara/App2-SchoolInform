package com.prolificinteractive.materialcalendarview.sample;

/**
 * Created by Sun_Sun on 2017-10-19.
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by songmho on 2015-01-02.
 */
public class page_1 extends android.support.v4.app.Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.page, container, false);

        LinearLayout background = (LinearLayout) linearLayout.findViewById(R.id.background);
        background.setBackgroundResource(R.drawable.school);



        return linearLayout;
    }
}
