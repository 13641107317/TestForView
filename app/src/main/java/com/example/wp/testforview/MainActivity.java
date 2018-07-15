package com.example.wp.testforview;

import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ImageView image;
    LinkedList linkedList;
    private PointAnimView mPoint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPoint = (PointAnimView) findViewById(R.id.point);

        image = (ImageView) findViewById(R.id.image);
        ClipDrawable testClipDrawable = (ClipDrawable) image.getDrawable();
        testClipDrawable.setLevel(8000);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mPoint.setInterpolatorType(2);
            mPoint.setColor(Color.RED);
            mPoint.startAnimation();
        }

    }
}
