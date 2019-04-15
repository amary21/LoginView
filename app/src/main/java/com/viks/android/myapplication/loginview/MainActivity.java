package com.viks.android.myapplication.loginview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btnLogin, btnCreateNew;
    TextView tvForgotPw, tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
        btnCreateNew = findViewById(R.id.btn_createnew);
        tvForgotPw = findViewById(R.id.tv_forgot);
        tvShow = findViewById(R.id.tv_show);
        tvShow = findViewById(R.id.tv_show);

//        etPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean b) {
//                if (hasWindowFocus()){
//                    tvShow.setVisibility(View.VISIBLE);
//                    tvShow.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            if (tvShow.getText().toString().equals("Show")){
//                                etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
//                                tvShow.setText("Hide");
//                            }else{
//                                etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
//                                tvShow.setText("Show");
//                            }
//                        }
//                    });
//                }
//            }
//        });

        tvShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvShow.setText("Hide");
            }
        });


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().equals("admin") && etPassword.getText().toString().equals("admin123")){
                    showAfterLogin();
                }else {
                    Toast.makeText(MainActivity.this, "salah password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void showAfterLogin() {
        setContentView(R.layout.activity_after_login);
    }



}
