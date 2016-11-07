package com.example.cho.loginregister;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    private ImageView img_Logo;
    private EditText etEmail;
    private Button bSendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        img_Logo = (ImageView) findViewById(R.id.img_Logo);
        etEmail = (EditText) findViewById(R.id.etEmail);
        bSendEmail = (Button) findViewById(R.id.bSendEmail);

        bSendEmail.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EmailActivity.class);
                startActivityForResult(intent, 1000);
            }
        });
/*
        Intent result = new Intent();
        result.putExtra("User Email", bSendEmail.getText().toString());
        // 자신을 호출한 Activity로 데이터를 보낸다.
        setResult(RESULT_OK, result);
        //finish();
        */
    }
}