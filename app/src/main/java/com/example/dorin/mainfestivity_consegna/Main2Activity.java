package com.example.dorin.mainfestivity_consegna;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ImageView im1;
    ImageView im2;
    ImageView im3;
    ImageView im4;
    ImageView im5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        im1 = (ImageView)  findViewById(R.id.imageView1);
        im2 = (ImageView)  findViewById(R.id.imageView2);
        im3 = (ImageView)  findViewById(R.id.imageView3);
        im4 = (ImageView)  findViewById(R.id.imageView4);
        im5 = (ImageView)  findViewById(R.id.imageView5);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog d = new Dialog(Main2Activity.this);
                d.setContentView(R.layout.uno);
                d.show();

            }
        });

        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog d = new Dialog(Main2Activity.this);
                d.setContentView(R.layout.due);
                d.show();

            }
        });

        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog d = new Dialog(Main2Activity.this);
                d.setContentView(R.layout.tre);
                d.show();

            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {

            Dialog d = new Dialog(Main2Activity.this);
            d.setContentView(R.layout.quattro);
            d.show();

        }
    });

        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog d = new Dialog(Main2Activity.this);
                d.setContentView(R.layout.cinque);
                d.show();

            }
        });
    }

}
