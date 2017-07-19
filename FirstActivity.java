package com.smooets.hamdanhanafi.multiscreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText username;
    EditText password;
    String nameValue;
    String emailValue;
    String usernameValue;
    String passwordValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        username = (EditText)findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }

    public void onSubmit(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        this.nameValue = this.name.getText().toString();
        this.emailValue = this.email.getText().toString();
        this.usernameValue = this.username .getText().toString();
        this.passwordValue = this.password.getText().toString();
        Boolean hasError = false;

        if (TextUtils.isEmpty(this.nameValue)) {
            this.name.setError("Name Field is Required");
            hasError = true;
        }

        if (TextUtils.isEmpty(this.emailValue)) {
            this.email.setError("Email Field is Required");
            hasError = true;
        }

        if (TextUtils.isEmpty(this.nameValue)) {
            this.username.setError("Name Field is Required");
            hasError = true;
        }

        if (TextUtils.isEmpty(this.passwordValue)) {
            this.password.setError("Password Field is Required");
            hasError = true;
        }

        if (!hasError) {
            intent.putExtra("name", this.nameValue);
            intent.putExtra("email", this.emailValue);
            intent.putExtra("username", this.usernameValue);
            startActivity(intent);
            this.resetForm();
        }
    }

    public void onReset(View v) {
        this.resetForm();
    }

    public void resetForm() {
        this.name.setText("");
        this.email.setText("");
        this.username.setText("");
        this.password.setText("");
    }
}
