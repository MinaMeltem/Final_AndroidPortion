package com.example.finalexampracticalportion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userNameET;
    private EditText passwordET;
    private Button submitBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameET = (EditText) findViewById(R.id.user_name_et);
        passwordET = (EditText) findViewById(R.id.password_et);
        submitBT = (Button) findViewById(R.id.submit_bt);

        submitBT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String userName = userNameET.getText().toString();
                String password = passwordET.getText().toString();

                try {
                    if (userName.matches("")) {
                        Toast.makeText(getApplicationContext(), "Enter a User Name", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (password.matches("")) {
                        Toast.makeText(getApplicationContext(), "Enter a password", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        Intent intent = new Intent(getBaseContext(), ProfileActivity.class);
                        startActivity(intent);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }
}
