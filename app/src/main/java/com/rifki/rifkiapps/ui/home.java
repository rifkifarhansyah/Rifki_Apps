package com.rifki.rifkiapps.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rifki.rifkiapps.MainActivity;
import com.rifki.rifkiapps.R;
/*

14/04/2020
membuat keseluruhan program dan tampilan

nim   : 10117193
nama  : Rifki Farhansyah
kelas : if-5

 */
public class home extends AppCompatActivity {
    private Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_back = (Button) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
