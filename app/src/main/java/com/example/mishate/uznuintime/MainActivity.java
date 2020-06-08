package com.example.mishate.uznuintime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;



public class MainActivity extends AppCompatActivity implements OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRozklad = (Button) findViewById(R.id.button2);
        Button btnProfile = (Button) findViewById(R.id.teacher_btn);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        i = new Intent(this, profile_page.class);
        startActivity(i);
    }
    public void onClick1(View vv) {
        Intent i1;
        i1 = new Intent(this, Signup_form.class);
        startActivity(i1);
    }
}
