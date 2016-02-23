package com.dax.example.teachwriting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class TouchActivity extends AppCompatActivity {

    private RecordingDrawView recordingDrawView;
    private ImageButton currPaint;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vangogh);

        recordingDrawView = (RecordingDrawView) findViewById(R.id.drawing);
        LinearLayout paintLayout = (LinearLayout) findViewById(R.id.paint_colors);
        currPaint = (ImageButton) paintLayout.getChildAt(0);
        currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));


    }

    public void paintClicked(View view) {
        if (view != currPaint) {
            ImageButton imgView = (ImageButton)view;
            String color = view.getTag().toString();
            recordingDrawView.setColor(color);
            imgView.setImageDrawable(getResources().getDrawable(R.drawable.paint_pressed));
            currPaint.setImageDrawable(getResources().getDrawable(R.drawable.paint));
            currPaint=(ImageButton)view;
        }

    }

    public void recClicked(View view) {
           recordingDrawView.setRecord();
    }

    public void okClicked(View view) {
            recordingDrawView.setOK();
    }

    public void clearClicked(View view) {
        recordingDrawView.clear();
    }

}
