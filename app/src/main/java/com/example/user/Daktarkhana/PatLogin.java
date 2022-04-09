package com.example.user.Daktarkhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PatLogin extends AppCompatActivity {

    EditText mTextUsername;
    EditText mTextPass;
    Button mButtonLogin;
    TextView mTextViewSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        mTextUsername = (EditText)findViewById(R.id.edittext_username);
        mTextPass = (EditText)findViewById(R.id.edittext_pass);
        mButtonLogin = (Button)findViewById(R.id.button_login);
        mTextViewSignup = (TextView) findViewById(R.id.textview_signup);
        mTextViewSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupIntent = new Intent(PatLogin.this,SignupActivity.class);
                startActivity(signupIntent);
            }
        });

    }
}
