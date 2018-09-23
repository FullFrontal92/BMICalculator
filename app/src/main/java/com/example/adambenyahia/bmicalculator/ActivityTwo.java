package com.example.adambenyahia.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void calcbmi (){

        double height=0;
        double weight=0;
        double bmi=0;
        String msg="";

        EditText et1 = (EditText) findViewById(R.id.editText1);
        EditText et2 = (EditText) findViewById(R.id.editText2);

        Button b1 = (Button) findViewById(R.id.button2);

        TextView t1= (TextView) findViewById(R.id.textView1);
        TextView t2= (TextView) findViewById(R.id.textView2);

        weight= Double.parseDouble(et1.getText().toString());
        height= Double.parseDouble(et2.getText().toString());

        bmi= height * height;
        bmi= weight/bmi;

        t1.setText(String.valueOf(bmi));

        if (bmi<18.5){

            msg="Underweight";
        }
        else if (bmi>18.5 && bmi<25){

            msg="Normal";
        }
        else if (bmi>25){
            msg="overweight";
        }

        t2.setText(msg);

    }
}
