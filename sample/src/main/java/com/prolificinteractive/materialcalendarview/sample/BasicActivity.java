package com.prolificinteractive.materialcalendarview.sample;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Shows off the most basic usage
 */
public class BasicActivity extends AppCompatActivity implements OnDateSelectedListener, OnMonthChangedListener {
    public EditText email;
    public EditText school;
    public EditText grade;
    public EditText area;
    public EditText divisionschool;
    public EditText phone;
    public ImageView send;
    private FirebaseDatabase database;

    private static final DateFormat FORMATTER = SimpleDateFormat.getDateInstance();

    @BindView(R.id.calendarView)
    MaterialCalendarView widget;

    @BindView(R.id.textView)
    TextView textView;
    Button but_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        ButterKnife.bind(this);

        widget.setOnDateChangedListener(this);
        widget.setOnMonthChangedListener(this);

        //Setup initial text
        textView.setText(getSelectedDatesString());

        //다이얼로그
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_member);

        database = FirebaseDatabase.getInstance();

        email = (EditText) dialog.findViewById(R.id.edit_email);
        school = (EditText) dialog.findViewById(R.id.edit_school);
        grade = (EditText) dialog.findViewById(R.id.edit_grade);
        area = (EditText) dialog.findViewById(R.id.edit_area);
        divisionschool = (EditText) dialog.findViewById(R.id.edit_division);
        phone = (EditText) dialog.findViewById(R.id.edit_phone);
        send = (ImageView) dialog.findViewById(R.id.but_send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data data = new Data();
                data.email = email.getText().toString();
                data.school = school.getText().toString();
                data.grade = grade.getText().toString();
                data.area = area.getText().toString();
                data.divisionschool = divisionschool.getText().toString();
                data.phone = phone.getText().toString();

                database.getReference().child("schoolfair").push().setValue(data);

                dialog.dismiss();
            }
        });


        but_1 = (Button) findViewById(R.id.but_1);
        but_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
    }

    @Override
    public void onDateSelected(@NonNull MaterialCalendarView widget, @Nullable CalendarDay date, boolean selected) {
        but_1 = (Button) findViewById(R.id.but_1);
        textView.setText(getSelectedDatesString());
        but_1.setVisibility(View.VISIBLE);
    }

    @Override
    public void onMonthChanged(MaterialCalendarView widget, CalendarDay date) {
        //noinspection ConstantConditions
        getSupportActionBar().setTitle(FORMATTER.format(date.getDate()));
    }

    private String getSelectedDatesString() {
        CalendarDay date = widget.getSelectedDate();

        if (date == null) {
            return "스크롤을 내려 아래의 입학설명회 일정을 확인하고, 해당 날짜를 눌러 신청하세요";
        }
        return FORMATTER.format(date.getDate());
    }
}
