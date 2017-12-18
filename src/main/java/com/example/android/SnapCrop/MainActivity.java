package com.example.android.SnapCrop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.example.android.camera2basic.R;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.android.camera2basic.crop";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void tomato(View view) {
        Intent intent = new Intent(this, CameraActivity.class);
        intent.putExtra("crop", "tomato");
        /*try {

            PrintWriter writer = new PrintWriter("crop.txt", "UTF-8");
            writer.println("tomato");
            writer.close();


        }
        catch(Exception e){
            e.printStackTrace();
        }*/
        startActivity(intent);

    }

    public void potato(View view) {
        Intent intent = new Intent(this, CameraActivity.class);
        intent.putExtra("crop","potato");

   /*
        try {

            PrintWriter writer = new PrintWriter("crop.txt", "UTF-8");
            writer.println("potato");
            writer.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }*/
        startActivity(intent);

    }


    public void grape(View view) {
        Intent intent = new Intent(this, CameraActivity.class);
        intent.putExtra("crop","grape");
        /*try {

            PrintWriter writer = new PrintWriter("crop.txt", "UTF-8");
            writer.println("tomato");
            writer.close();


        }
        catch(Exception e){
            e.printStackTrace();
        }*/
        startActivity(intent);

    }


    public void corn(View view) {
        Intent intent = new Intent(this, CameraActivity.class);
        intent.putExtra("crop","corn");
        /*try {

            PrintWriter writer = new PrintWriter("crop.txt", "UTF-8");
            writer.println("tomato");
            writer.close();


        }
        catch(Exception e){
            e.printStackTrace();
        }*/
        startActivity(intent);

    }


}
