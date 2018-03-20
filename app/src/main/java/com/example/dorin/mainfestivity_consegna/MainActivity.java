package com.example.dorin.mainfestivity_consegna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView) findViewById(R.id.imageView);
        final TextView testo =(TextView)  findViewById(R.id.textView2);
        Spinner lingua = (Spinner)  findViewById(R.id.spinner);
        final Button bt1 = (Button) findViewById(R.id.button);
        final Button bt2 = (Button) findViewById(R.id.button2);
        final Button bt3 = (Button) findViewById(R.id.button3);
        final TextView con = (TextView) findViewById(R.id.textView);




        image.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(testo.getVisibility() == testo.VISIBLE){
                    testo.setVisibility(testo.INVISIBLE);
                } else {
                    testo.setVisibility(testo.VISIBLE);
                }
            }

        });

        lingua.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                if(position == 1 ) {
                    testo.setText(getString(R.string.infoI));
                    bt1.setText(getString(R.string.italyI));
                    bt2.setText(getString(R.string.moldaviaI));
                    bt3.setText(getString(R.string.englandI));
                    con.setText(getString(R.string.select_the_countryI));
                }

                if(position == 2 ) {
                    testo.setText(getString(R.string.infoR));
                    bt1.setText(getString(R.string.italyR));
                    bt2.setText(getString(R.string.moldaviaR));
                    bt3.setText(getString(R.string.englandR));
                    con.setText(getString(R.string.select_the_countryR));
                }

                if(position == 0 ) {
                    testo.setText(getString(R.string.infoE));
                    bt1.setText(getString(R.string.italyE));
                    bt2.setText(getString(R.string.moldaviaE));
                    bt3.setText(getString(R.string.englandE));
                    con.setText(getString(R.string.select_the_countryE));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main3Activity.class));
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main4Activity.class));
            }
        });
    }
}
