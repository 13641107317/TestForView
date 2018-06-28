package com.example.wp.testforview;

import android.graphics.drawable.ClipDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ImageView image;
    LinkedList linkedList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.image);
        ClipDrawable testClipDrawable = (ClipDrawable) image.getDrawable();
        testClipDrawable.setLevel(8000);

    }
}
