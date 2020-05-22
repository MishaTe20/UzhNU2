package com.example.mishate.InTime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mishate.uznuintime.R;

public class profile_page extends AppCompatActivity {

    String[] data = {"Біологічний факультет", "Георгафічний факультет", "Економічний факультет", "Інженерно-технічний факультет", "Медичний факультет",
    "Медичний факультет №2", "Стоматологічний факультет", "Факультет здоров'я та фізичного виховання", "Факультет іноземної філології", "Факультет інформаційних технологій", "Факультет історії та міжнародних відносин", "Факультет математики та цифрових технологій",
            "Факультет міжнародних економічних відносин", "Факультет післядипломної освіти та доуніверситетської підготовки",
            "Факультет суспільних наук", "Факультет туризму та міжнародних комунікацій", "Фізичний факультет", "Філологічний факультет",
            "Хімічний факультет", "Юридичний факультет", "Кафедра військової підготовки" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        // заголовок
        spinner.setPrompt("Факультет");

    }
}
