package com.rifki.rifkiapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rifki.rifkiapps.ui.daily;
import com.rifki.rifkiapps.ui.galery;
import com.rifki.rifkiapps.ui.home;
/*

14/04/2020
membuat keseluruhan program dan tampilan

nim   : 10117193
nama  : Rifki Farhansyah
kelas : if-5

 */
public class MainActivity extends AppCompatActivity {
    private Button menu1;
    private Button menu2;
    private Button menu3;
    private Button menu4;
    private Button menu5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu1 = (Button) findViewById(R.id.menu1);
        menu2 = (Button) findViewById(R.id.menu2);
        menu3 = (Button) findViewById(R.id.menu3);
        menu4 = (Button) findViewById(R.id.menu4);
        menu5 = (Button) findViewById(R.id.menu5);

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, home.class);
                startActivity(intent);
                finish();
            }
        });
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, daily.class);
                startActivity(intent);
                finish();
            }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, galery.class);
                startActivity(intent);
                finish();
            }
        });





    }
}
