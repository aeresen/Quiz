package com.example.android.quiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkResults(View view) {
        int results=0;
        //RadioGroup q1RG = (RadioGroup) findViewById(R.id.question1);
        //int selectedId = q1RG.getCheckedRadioButtonId();
        RadioButton q1RB = (RadioButton) findViewById(R.id.question1option1);
        RadioButton q2RB = (RadioButton) findViewById(R.id.question2option4);
        RadioButton q3RB = (RadioButton) findViewById(R.id.question3option2);
        RadioButton q4RB = (RadioButton) findViewById(R.id.question4option3);
        RadioButton q5RB = (RadioButton) findViewById(R.id.question5option1);
        RadioButton q6RB = (RadioButton) findViewById(R.id.question6option2);
        RadioButton q7RB = (RadioButton) findViewById(R.id.question7option1);
        RadioButton q8RB = (RadioButton) findViewById(R.id.question8option3);
        RadioButton q9RB = (RadioButton) findViewById(R.id.question9option1);
        RadioButton q10RB = (RadioButton) findViewById(R.id.question10option2);
        boolean res1 = ((RadioButton) q1RB).isChecked();
        boolean res2 = ((RadioButton) q2RB).isChecked();
        boolean res3 = ((RadioButton) q3RB).isChecked();
        boolean res4 = ((RadioButton) q4RB).isChecked();
        boolean res5 = ((RadioButton) q5RB).isChecked();
        boolean res6 = ((RadioButton) q6RB).isChecked();
        boolean res7 = ((RadioButton) q7RB).isChecked();
        boolean res8 = ((RadioButton) q8RB).isChecked();
        boolean res9 = ((RadioButton) q9RB).isChecked();
        boolean res10 = ((RadioButton) q10RB).isChecked();
        if (res1) { results += 1; }
        if (res2) { results += 1; }
        if (res3) { results += 1; }
        if (res4) { results += 1; }
        if (res5) { results += 1; }
        if (res6) { results += 1; }
        if (res7) { results += 1; }
        if (res8) { results += 1; }
        if (res9) { results += 1; }
        if (res10) { results += 1; }

        String resultSentence = "You had " + String.valueOf(results) + " correct answers out of 10.";

        Toast.makeText(this,resultSentence, Toast.LENGTH_SHORT).show();
    }
}
