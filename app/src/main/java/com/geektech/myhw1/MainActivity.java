package com.geektech.myhw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText enterLogin;
    EditText password;
    TextView textError;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterLogin = findViewById(R.id.enter_login);
        password = findViewById(R.id.password);
        textError = findViewById(R.id.text_error);

    }

    public void enter(View view) {
        if (enterLogin.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {
            textError.setVisibility(View.VISIBLE);
        } else {
            Toast.makeText(this, "Вы успешно вошли", Toast.LENGTH_LONG).show();
            textError.setVisibility(View.INVISIBLE);
        }
    }
}