package com.example.ummazcakery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {
    private ImageView image;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third2);

        image = (ImageView)findViewById(R.id.imageView4);
        image2 = (ImageView)findViewById(R.id.imageView5);
        image3 = (ImageView)findViewById(R.id.imageView6);
        image4 = (ImageView)findViewById(R.id.imageView2);
    }
}
