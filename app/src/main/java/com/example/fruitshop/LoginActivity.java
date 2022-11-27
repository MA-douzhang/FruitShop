package com.example.fruitshop;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText editTextUserName;
    private EditText editTextPassword;
    private CheckBox checkBoxRemember;
    private Button buttonLogin;
    private Button buttonRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //控件绑定
        initView();
        btnLoginClick();
        displayInfo();
    }

    private void displayInfo() {
        String userName = getSharedPreferences("myInfo",0).getString("userName","");
        String password = getSharedPreferences("myInfo",0).getString("password","");
        Boolean checkbox = getSharedPreferences("myInfo",0).getBoolean("checkbox",false);

        if(checkbox){
            editTextUserName.setText(userName);
            editTextPassword.setText(password);
            checkBoxRemember.setChecked(true);
        }else {
            editTextUserName.setText("");
            editTextPassword.setText("");
            checkBoxRemember.setChecked(false);
        }
    }

    private void btnLoginClick() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("myInfo",0).edit();
                editor.putString("userName",editTextUserName.getText().toString());
                editor.putString("password",editTextPassword.getText().toString());
                editor.putBoolean("checkbox",checkBoxRemember.isChecked());
                editor.commit();
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
                finish();
            }
        });
    }

    private void initView() {
        editTextUserName = findViewById(R.id.editText_userName);
        editTextPassword = findViewById(R.id.editText_password);
        checkBoxRemember = findViewById(R.id.checkbox_remember);
        buttonLogin = findViewById(R.id.button_login);
        buttonRegister = findViewById(R.id.button_register);
    }
}