package com.example.android.quiz;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    int correct = 0;
    int wrong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void submit(View view){


        EditText name = (EditText) findViewById(R.id.name);
        Editable nameE = name.getText();
        String nameUser = nameE.toString();

        RadioButton me = (RadioButton) findViewById(R.id.me);

        if(me.isChecked()){
            correct ++;

        } else {
            wrong ++;
        }

        CheckBox yugo = (CheckBox) findViewById(R.id.yugi);
        boolean yugiChecked = yugo.isChecked();

        CheckBox snoop = (CheckBox) findViewById(R.id.snoop);
        boolean snoopChecked = snoop.isChecked();



        if(yugiChecked && snoopChecked){
            correct ++;

        } else {
            wrong ++;
        }

        RadioButton trad = (RadioButton) findViewById(R.id.traditional);
        //boolean traditionalWay = trad.isChecked();

        if (trad.isChecked()){
            correct++;
        } else {
            wrong++;
        }

        CheckBox weThe = (CheckBox) findViewById(R.id.best);
        boolean weTheBest = weThe.isChecked();

        CheckBox gokuG = (CheckBox) findViewById(R.id.goku);
        boolean goku = gokuG.isChecked();

        if(weTheBest && goku) {
            correct++;
        } else {
            wrong ++;
        }





        //display in long period of time
        Toast.makeText(getApplicationContext(), "Welcome, " + nameUser + "\n Correct: " + correct + "\n Wrong: " + wrong,
                Toast.LENGTH_LONG).show();

        correct = 0;
        wrong = 0;



    }


}

