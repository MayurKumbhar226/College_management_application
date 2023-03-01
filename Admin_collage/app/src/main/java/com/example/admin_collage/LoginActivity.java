package com.example.admin_collage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    private EditText user_email, user_pass;
    private TextView txt_show;
    private RelativeLayout login_btn;

    private String email, pass;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Admin_Login");


        sharedPreferences = this.getSharedPreferences("login",MODE_PRIVATE);
        editor = sharedPreferences.edit();

        if (sharedPreferences.getString("isLogin","false").equals("yes")){

            openDash();
        }

        user_email = findViewById(R.id.user_email);
        user_pass = findViewById(R.id.user_pass);
        txt_show = findViewById(R.id.txt_show);
        login_btn = findViewById(R.id.login_btn);




        txt_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (user_pass.getInputType()  == 144){
                    user_pass.setInputType(129);
                    user_pass.setText("Hide");

                }else {

                    user_pass.setInputType(144);
                    txt_show.setText("Show");

                }
                user_pass.setSelection(user_pass.getText().length());

            }
        });

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateData();

            }
        });

    }

    private void validateData() {

        email = user_email.getText().toString();
        pass = user_pass.getText().toString();

        if (email.isEmpty()){

            user_email.setError("Required");
            user_email.requestFocus();

        }else if (pass.isEmpty()){


            user_pass.setError("Required");
            user_pass.requestFocus();

        }else if (email.equals("kcwankhede226@gmail.com") && pass.equals("123456")){


            editor.putString("isLogin", "yes");
            editor.commit();
            openDash();
        }else {

            Toast.makeText(this, "Please check password and email !", Toast.LENGTH_SHORT).show();
        }

    }

    private void openDash() {

        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();

    }
}