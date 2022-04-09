package com.example.user.Daktarkhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DocPatSign extends AppCompatActivity {

    Button mButtonPatient;
    Button mButtonDoctor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_pat_sign);
        mButtonPatient = (Button) findViewById(R.id.button_pat);
        mButtonPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent patloginIntent = new Intent(DocPatSign.this, PatLogin.class);
                startActivity(patloginIntent);
    }

    });
        mButtonDoctor = (Button) findViewById(R.id.button_doc);
        mButtonDoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent docloginIntent = new Intent(DocPatSign.this,DocLogin.class);
                startActivity(docloginIntent);
            }
        });

    }
}

