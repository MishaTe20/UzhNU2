package com.example.mishate.uznuintime;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;


public class reset_password extends AppCompatActivity {

    EditText reset_email;
    Button reset_btn;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        reset_btn = (Button) findViewById(R.id.reset_btn);
        reset_email = (EditText) findViewById(R.id.reset_email);

        mAuth = FirebaseAuth.getInstance();

        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.sendPasswordResetEmail(reset_email.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()) {
                                    Toast.makeText(reset_password.this, "Пароль відправлений на пошту", Toast.LENGTH_SHORT).show();
                                }
                                else {
                                    Toast.makeText(reset_password.this, "Помилка!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                                }
                            }
                        });


            }
        });
    }

}
