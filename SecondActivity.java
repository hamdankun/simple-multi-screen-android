package com.smooets.hamdanhanafi.multiscreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras = getIntent().getExtras();
        String name = extras.getString("name");
        String email = extras.getString("email");
        String username = extras.getString("username");
        TextView textViewName = (TextView) findViewById(R.id.valueName);
        TextView textViewEmail = (TextView) findViewById(R.id.valueEmail);
        TextView textViewUsername = (TextView) findViewById(R.id.valueUsername);
        textViewName.setText(": "+name);
        textViewEmail.setText(": "+email);
        textViewUsername.setText(": "+username);
    }

    public void goBack(View v) {
        this.finish();
    }
}
