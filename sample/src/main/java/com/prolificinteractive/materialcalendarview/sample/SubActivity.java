package com.prolificinteractive.materialcalendarview.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Sun_Sun on 2017-10-02.
 */

public class SubActivity extends MainActivity {

    ImageButton newsol,design,soft;

 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

     findViewById(R.id.soft).setOnClickListener(
             new Button.OnClickListener() {
                 public void onClick(View v) {
                     soft = (ImageButton) findViewById(R.id.soft);
                     soft.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             Intent intent = new Intent(SubActivity.this, NewSoftwareActivity.class);
                             startActivity(intent);
                         }
                     });
                 }
             });

     findViewById(R.id.design).setOnClickListener(
             new Button.OnClickListener() {
                 public void onClick(View v) {
                     design = (ImageButton) findViewById(R.id.design);
                     design.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             Intent intent = new Intent(SubActivity.this, NewDesignActivity.class);
                             startActivity(intent);
                         }
                     });
                 }
             });

     findViewById(R.id.newsol).setOnClickListener(
             new Button.OnClickListener() {
                 public void onClick(View v) {
                     newsol = (ImageButton) findViewById(R.id.newsol);
                     newsol.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             Intent intent = new Intent(SubActivity.this, NewSolActivity.class);
                             startActivity(intent);
                         }
                     });
                 }
             });
    }

}

