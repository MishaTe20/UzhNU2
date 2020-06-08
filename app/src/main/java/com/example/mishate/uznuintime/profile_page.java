package com.example.mishate.uznuintime;
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

import java.util.ArrayList;

public class profile_page extends AppCompatActivity {

    ArrayAdapter<String> cafedra_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);
        Spinner spinner = (Spinner) findViewById(R.id.facult);
        final Spinner spinner_caf = (Spinner) findViewById(R.id.cafedra);

        ArrayList<String> faculty = new ArrayList<>();
        faculty.add(0, "Факультет");
        faculty.add(1, "Біологічний факультет");
        faculty.add(2, "Георгафічний факультет");
        faculty.add(3, "Економічний факультет");
        faculty.add(4, "Інженерно-технічний факультет");
        faculty.add(5, "Медичний факультет");
        faculty.add(6, "Медичний факультет №2");
        faculty.add(7, "Стоматологічний факультет");
        faculty.add(8, "Факультет здоров'я та фізичного виховання");
        faculty.add(9, "Факультет іноземної філології");
        faculty.add(10, "Факультет інформаційних технологій");
        faculty.add(11, "Факультет історії та міжнародних відносин");
        faculty.add(12, "Факультет математики та цифрових технологій");
        faculty.add(13, "Факультет міжнародних економічних відносин");
        faculty.add(14, "Факультет післядипломної освіти та доуніверситетської підготовки");
        faculty.add(15, "Факультет суспільних наук");
        faculty.add(16, "Факультет туризму та міжнародних комунікацій");
        faculty.add(17, "Фізичний факультет");
        faculty.add(18, "Філологічний факультет");
        faculty.add(19, "Хімічний факультет");
        faculty.add(20, "Юридичний факультет");
        faculty.add(21, "Кафедра військової підготовки");


        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, faculty);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);


            ///CAFEDRA

        final ArrayList<String> biology = new ArrayList<>();
        biology.add("Кафедра ботаніки");
        biology.add("Кафедра ентомології та збереження біорізноманіття");
        biology.add("Кафедра генетики, фізіології рослин та мікробіології");
        biology.add("Кафедра плодоовочівництва і виноградства");

        final ArrayList<String> geography = new ArrayList<>();
        geography.add("Кафедра землевпорядкування та кадастру");
        geography.add("Кафедра фізичної географії та раціонального природокористування");
        geography.add("Кафедра лісництва");


        final ArrayList<String> econom = new ArrayList<>();
        econom.add("Кафедра економіки і підприємництва");
        econom.add("Кафедра економічної теорії");
        econom.add("Кафедра фінансів і банківської справи");
        econom.add("Кафедра обліку і аудиту");


        final ArrayList<String> ingener = new ArrayList<>();
        ingener.add("Кафедра комп'ютерних систем та мереж");
        ingener.add("Кафедра технології машинобудування");
        ingener.add("Кафедра приладобудування");
        ingener.add("Кафедра міського будівництва і господарства");
        ingener.add("Кафедра електронних систем");



        final ArrayList<String> medical = new ArrayList<>();
        medical.add("Кафедра пропедевтики внутрішніх хвороб");
        medical.add("Кафедра соціальної медицини та гігієни");
        medical.add("Кафедра біохімії, фармакології та фізичних методів лікування");
        medical.add("Кафедра факультетської терапії");
        medical.add("Кафедра хірургічних хвороб");
        medical.add("Кафедра дитячих хвороб");
        medical.add("Кафедра госпітальної терапії");
        medical.add("Кафедра загальної терапії");
        medical.add("Кафедра фізіології та патофізіології");
        medical.add("Кафедра неврології, нейрохірургії та психіатрії");
        medical.add("Кафедра акушерства та гінекології");
        medical.add("Кафедра онкології");
        medical.add("Кафедра шкірних та венеричних хвороб");
        medical.add("Кафедра анатомії людини та гістології");
        medical.add("Кафедра фармацевтичних дисциплін");
        medical.add("Кафедра мікробіології, вірусології та епідеміології з\\к інфекційних хвороб");


        final ArrayList<String> medical_2 = new ArrayList<>();
        medical_2.add("Кафедра громадського здоров'я і гуманітарних дисциплін");
        medical_2.add("Кафедра внутрішніх хвороб");
        medical_2.add("Кафедра фундаментальних медичних дисциплін");


        final ArrayList<String> stomat = new ArrayList<>();
        stomat.add("Кафедра терапевтичної стоматології");
        stomat.add("Кафедра хірургічної стоматології щелепно-лицевої хірургії та онкостоматології");
        stomat.add("Кафедра дитячої стоматології");
        stomat.add("Кафедра ортопедичної стоматології");
        stomat.add("Кафедра стоматології післядипломної освіти з курсом терапевтичної та ортопедичної стоматології");
        stomat.add("Кафедра стоматології дитячого віку");
        stomat.add("Кафедра фундаментальних медичних дисциплін");
        stomat.add("Кафедра клініко-лабораторної діагностики та фармакології");
        stomat.add("Кафедра клінічних дисциплін");
        stomat.add("Навчально-науковий тренінговий центр післядипломної освіти стоматологічного факультету ДВНЗ \"УжНУ\"");
        stomat.add("Науково-навчальний центр \"Клінічної пародонтології та патології слизових оболонок рота\"");


        final ArrayList<String> health = new ArrayList<>();
        health.add("Кафедра фізичного виховання");
        health.add("Кафедра фізичної реабілітації");
        health.add("Кафедра основ медицини");
        health.add("Кафедра наук про здоров'я");

        final ArrayList<String> foreign = new ArrayList<>();
        foreign.add("Кафедра німецької філології");
        foreign.add("Кафедра класичної та румунської філології");
        foreign.add("Кафедра французької мови та зарубіжної літератури");
        foreign.add("Кафедра англійської філології");
        foreign.add("Кафедра іноземних мов");


        final ArrayList<String> infotech = new ArrayList<>();
        infotech.add("Кафедра програмного забезпечення");
        infotech.add("Кафедра інформаційних управляючих систем та технологій");
        infotech.add("Кафедра інформатики та фізико-математичних дисциплін");


        final ArrayList<String> history_inter_relations = new ArrayList<>();
        history_inter_relations.add("Кафедра археології, етнології та культурології");
        history_inter_relations.add("Кафедра міжнародних студій та суспільних комунікацій");
        history_inter_relations.add("Кафедра античності, середньовіччя та історії України домодерної доби");
        history_inter_relations.add("Кафедра бізнес-адміністрування, маркетингу та менеджменту");
        history_inter_relations.add("Кафедра модерної історії України та зарубіжних країн");
        history_inter_relations.add("Кафедра політкультурної освіти та перекладу");


        final ArrayList<String> math_tech = new ArrayList<>();
        math_tech.add("Кафедра алгебри");
        math_tech.add("Кафедра теорії ймовірності і математичного аналізу");
        math_tech.add("Кафедра диференціальних рівнянь та математичної фізики");
        math_tech.add("Кафедра кібернетики і прикладної математики");
        math_tech.add("Кафедра системного аналізу і теорії оптимізації");


        final ArrayList<String> inter_econom_relations = new ArrayList<>();
        inter_econom_relations.add("Кафедра міжнародних економічних відносин");
        inter_econom_relations.add("Кафедра міжнародної політики");
        inter_econom_relations.add("Кафедра прикладної лінгвістики");
        inter_econom_relations.add("Кафедра теорії та практики перекладу");


        final ArrayList<String> postgraduate_preuniver = new ArrayList<>();
        postgraduate_preuniver.add("Кафедра терапії та сімейної медицини");
        postgraduate_preuniver.add("Кафедра онкології та радіології");
        postgraduate_preuniver.add("Кафедра нейрореабілітації із курсами медичної психології, пульмонології");
        postgraduate_preuniver.add("Кафедра хірургічних дисциплін");
        postgraduate_preuniver.add("Кафедра громадського здоров'я");
        postgraduate_preuniver.add("Кафедра охорони материнства та дитинства");
        postgraduate_preuniver.add("Центр доуніверситетської підготовки та роботи з іноземними громадянами");
        postgraduate_preuniver.add("Навчально-науковий тренінговий центр сімейної медицини та долікарської допомоги");



        final ArrayList<String> social_sciences = new ArrayList<>();
        social_sciences.add("Кафедра філософії");
        social_sciences.add("Кафедра психології");
        social_sciences.add("Кафедра загальної педагогіки та педагогіки вищої школи");
        social_sciences.add("Кафедра політології і державного управління");
        social_sciences.add("Кафедра соціології і соціальної роботи");


        final ArrayList<String> tourism_inter_com = new ArrayList<>();
        tourism_inter_com.add("Кафедра туризму");
        tourism_inter_com.add("Кафедра туристичної інфраструктури та готельно-ресторанного господарства");
        tourism_inter_com.add("Кафедра міжнародних комунікацій");


        final ArrayList<String> physics = new ArrayList<>();
        physics.add("Кафедра теоретичної фізики");
        physics.add("Кафедра фізики напівпровідників");
        physics.add("Кафедра квантової електроніки");
        physics.add("Кафедра твердотільної електроніки та інформаційної безпеки");
        physics.add("Кафедра оптики");
        physics.add("Кафедра прикладної фізики");
        physics.add("Відділення фізики ядра та елементарних частинок");


        final ArrayList<String> philology = new ArrayList<>();
        philology.add("Кафедра української мови");
        philology.add("Кафедра української літератури");
        philology.add("Кафедра журналістики");
        philology.add("Кафедра словацької філології");
        philology.add("Кафедра слов'янської філології та світової літератури");


        final ArrayList<String> chemistry = new ArrayList<>();
        chemistry.add("Кафедра органічної хімії");
        chemistry.add("Кафедра неорганічної хімії");
        chemistry.add("Кафедра екології та охорони навколишнього середовища");
        chemistry.add("Кафедра фізичної та колоїдної хімії");
        chemistry.add("Кафедра аналітичної хімії");


        final ArrayList<String> law = new ArrayList<>();
        law.add("Кафедра цивільного права та процесу");
        law.add("Кафедра конституційного права та порівняльного правознавства");
        law.add("Кафедра господарського права");
        law.add("Кафедра кримінального права і процесу");
        law.add("Кафедра теорії та історії держави і права");
        law.add("Кафедра адміністративного, фінансового та інформаційного права");
        law.add("Кафедра міжнародного права");



        final ArrayList<String> army = new ArrayList<>();
        army.add("Кафедра військової підготовки");




        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0)
                {
                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item);

                }
                else if(position == 1) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, biology);
                }
                else if(position == 2) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, geography);
                }
                else if(position == 3) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, econom);
                }
                else if(position == 4) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, ingener);
                }
                else if(position == 5) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, medical);
                }
                else if(position == 6) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, medical_2);
                }
                else if(position == 7) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, stomat);
                }
                else if(position == 8) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, health);
                }
                else if(position == 9) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, foreign);
                }
                else if(position == 10) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, infotech);
                }
                else if(position == 11) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, history_inter_relations);
                }
                else if(position == 12) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, math_tech);
                }
                else if(position == 13) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, inter_econom_relations);
                }
                else if(position == 14) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, postgraduate_preuniver);
                }
                else if(position == 15) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, social_sciences);
                }
                else if(position == 16) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, tourism_inter_com);
                }
                else if(position == 17) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, physics);
                }
                else if(position == 18) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, philology);
                }
                else if(position == 19) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, chemistry);
                }
                else if(position == 20) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, law);
                }
                else if(position == 21) {

                    cafedra_adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, army);
                }


                spinner_caf.setAdapter(cafedra_adapter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });























    }
}
