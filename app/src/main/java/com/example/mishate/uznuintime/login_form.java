package com.example.mishate.uznuintime;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;

public class login_form extends AppCompatActivity {

    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;
    GoogleApiClient client;
    EditText log_email;
    EditText log_password;
    Button log_btn;
    TextView reg_page;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        mAuth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();


                } else {
                    // User is signed out

                }
            }
        };


        log_email = (EditText) findViewById(R.id.logemail_field);
        log_password = (EditText) findViewById(R.id.password_field);
        log_btn = (Button) findViewById(R.id.btn_log);
        reg_page = (TextView) findViewById(R.id.reg_here);

        log_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = log_email.getText().toString().trim();
                String password = log_password.getText().toString().trim();

                if(TextUtils.isEmpty(email)) {
                    log_email.setError("Введіть електронну пошту.");
                    return;
                }

                if(TextUtils.isEmpty(password)) {
                    log_password.setError("Введіть пароль.");
                    return;
                }

                if(password.length() < 6) {
                    log_password.setError("Пароль має містити більше 6 символів");
                    return;
                }

                // АВТОРИЗАЦІЯ

                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            Toast.makeText(login_form.this, "Авторизація успішна", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        }
                        else
                        {
                            Toast.makeText(login_form.this, "Помилка!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                        }
                    }
                });
            }
        });

        reg_page = (TextView) findViewById(R.id.reg_here);
        reg_page.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {

        Intent myIntent = new Intent(v.getContext(), Signup_form.class);
                                              startActivity(myIntent);



                                          }
                                      }
        );


    }
}
