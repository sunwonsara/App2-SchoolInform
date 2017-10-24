package com.prolificinteractive.materialcalendarview.sample;

import android.os.Bundle;

/**
 * Created by Sun_Sun on 2017-10-02.
 */

public class NewDesignActivity extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
    }

    /**
     * Created by Sun_Sun on 2017-10-19.
     */

    public static class SchoolFairActivity extends MainActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_schoolfair);
        }
    }
}
