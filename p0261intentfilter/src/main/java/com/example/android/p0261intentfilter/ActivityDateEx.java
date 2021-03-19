package com.example.android.p0261intentfilter;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import java.sql.Date;
import java.text.SimpleDateFormat;
import android.os.Bundle;

public class ActivityDateEx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_ex);

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, yyyy");
        String date = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvDate = (TextView) findViewById(R.id.tvDate);
        tvDate.setText(date);
    }
}