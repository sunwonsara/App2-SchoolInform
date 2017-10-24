package com.prolificinteractive.materialcalendarview.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class QnAActivity extends AppCompatActivity implements View.OnClickListener {
    Button but_1,but_3,but_4,but_5,but_6,but_7;
    LinearLayout but_11;
    LinearLayout but_33;
    LinearLayout but_44;
    LinearLayout but_55;
    LinearLayout but_66;
    LinearLayout but_77;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qna);

        but_1 = (Button) findViewById(R.id.but_1);
        but_11 = (LinearLayout) findViewById(R.id.but_11); //(*)
        but_3 = (Button) findViewById(R.id.but_3);
        but_33 = (LinearLayout) findViewById(R.id.but_33); //(*)
        but_4= (Button) findViewById(R.id.but_4);
        but_44= (LinearLayout) findViewById(R.id.but_44);
        but_5 = (Button) findViewById(R.id.but_5);
        but_55 = (LinearLayout) findViewById(R.id.but_55);
        but_6 = (Button) findViewById(R.id.but_6);
        but_66 = (LinearLayout) findViewById(R.id.but_66);
        but_7 = (Button) findViewById(R.id.but_7);
        but_77 = (LinearLayout) findViewById(R.id.but_77);
        button2 = (Button)findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QnAActivity.this, ChatAcitivity.class);
                startActivity(intent);
            }
        });

        but_1.setOnClickListener(this);
        but_3.setOnClickListener(this);
        but_4.setOnClickListener(this);
        but_5.setOnClickListener(this);
        but_6.setOnClickListener(this);
        but_7.setOnClickListener(this);
    }
    public void onClick(View v){
        switch(v.getId()) {
            case R.id.but_1:
                if(but_11.getVisibility()==View.VISIBLE){
                    but_11.setVisibility(View.GONE);
                }else {
                    but_11.setVisibility(View.VISIBLE);
                }
                but_33.setVisibility(View.GONE);
                but_44.setVisibility(View.GONE);
                but_55.setVisibility(View.GONE);
                but_66.setVisibility(View.GONE);
                but_77.setVisibility(View.GONE);
                break;

            case R.id.but_3:
                but_11.setVisibility(View.GONE);
                if(but_33.getVisibility()==View.VISIBLE) {
                    but_33.setVisibility(View.GONE);
                }
                else {
                    but_33.setVisibility(View.VISIBLE);
                }
                but_44.setVisibility(View.GONE);
                but_55.setVisibility(View.GONE);
                but_66.setVisibility(View.GONE);
                but_77.setVisibility(View.GONE);
                break;

            case R.id.but_4:
                but_11.setVisibility(View.GONE);
                but_33.setVisibility(View.GONE);
                if(but_44.getVisibility()==View.VISIBLE) {
                    but_44.setVisibility(View.GONE);
                }
                else{
                    but_44.setVisibility(View.VISIBLE);
                }
                but_55.setVisibility(View.GONE);
                but_66.setVisibility(View.GONE);
                but_77.setVisibility(View.GONE);
                break;

            case R.id.but_5:
                but_11.setVisibility(View.GONE);
                but_33.setVisibility(View.GONE);
                but_44.setVisibility(View.GONE);
                if(but_55.getVisibility()==View.VISIBLE) {
                    but_55.setVisibility(View.GONE);
                }
                else{
                    but_55.setVisibility(View.VISIBLE);
                }
                but_66.setVisibility(View.GONE);
                but_77.setVisibility(View.GONE);
                break;

            case R.id.but_6:
                but_11.setVisibility(View.GONE);
                but_33.setVisibility(View.GONE);
                but_44.setVisibility(View.GONE);
                but_55.setVisibility(View.GONE);
                if(but_66.getVisibility()==View.VISIBLE) {
                    but_66.setVisibility(View.GONE);
                }else {
                    but_66.setVisibility(View.VISIBLE);
                }
                but_77.setVisibility(View.GONE);
                break;

            case R.id.but_7:
                but_11.setVisibility(View.GONE);
                but_33.setVisibility(View.GONE);
                but_44.setVisibility(View.GONE);
                but_55.setVisibility(View.GONE);
                but_66.setVisibility(View.GONE);
                if(but_77.getVisibility()==View.VISIBLE) {
                    but_77.setVisibility(View.GONE);
                }else{
                    but_77.setVisibility(View.VISIBLE);
                }
                break;
        }
    }
}
