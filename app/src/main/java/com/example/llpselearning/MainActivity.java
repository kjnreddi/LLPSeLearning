package com.example.llpselearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText UserName,Password;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserName = (EditText)findViewById(R.id.UserName);
        Password = (EditText)findViewById(R.id.Password);
        Submit = (Button) findViewById(R.id.Submit);
    }
}
