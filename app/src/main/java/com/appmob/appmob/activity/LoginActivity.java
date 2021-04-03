package com.appmob.appmob.activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.appmob.appmob.R;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText username, password;
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView (R.layout.login_relative);
        login = (Button) findViewById(R.id.btnSignIn);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.getText().toString().toUpperCase().equals("ADMIN")) {
                    login_sukses();
                } else {
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent a = new Intent(this, MainActivity.class);
        //kirimkan username ke tampilan utama
        a.putExtra("Username", user_login);
        startActivity(a);
    }
}
