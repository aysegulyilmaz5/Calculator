package com.aysegulyilmaz.calculation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText;
    double oldNumber,newNumber;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnc,btnad,btnsub,btn0,btndiv,btnmul,btneq,btncomma,btnper;
    boolean multiplication,addition,subtraction,division,comma;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.editText);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnad = findViewById(R.id.btnad);
        btnsub = findViewById(R.id.btnsub);
        btndiv = findViewById(R.id.btndiv);
        btnc = findViewById(R.id.btnc);
        btneq = findViewById(R.id.btneq);
        btnmul = findViewById(R.id.btnmul);
        btncomma = findViewById(R.id.btncomma);
        btnper = findViewById(R.id.btnper);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnad.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnc.setOnClickListener(this);
        btneq.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btncomma.setOnClickListener(this);
        btnper.setOnClickListener(this);

    }

    public void onClick(View v){
        String number = editText.getText().toString();
        switch(v.getId()) {
            case R.id.btn1:
                number += "1";
                editText.setText(number);
                break;
            case R.id.btn2:
                number += "2";
                editText.setText(number);
                break;
            case R.id.btn3:
                number += "3";
                editText.setText(number);
                break;
            case R.id.btn4:
                number += "4";
                editText.setText(number);
                break;
            case R.id.btn5:
                number += "5";
                editText.setText(number);
                break;
            case R.id.btn6:
                number += "6";
                editText.setText(number);
                break;
            case R.id.btn7:
                number += "7";
                editText.setText(number);
                break;
            case R.id.btn8:
                number += "8";
                editText.setText(number);
                break;
            case R.id.btn9:
                number += "9";
                editText.setText(number);
                break;
            case R.id.btn0:
                number += "0";
                editText.setText(number);
                break;
            case R.id.btnc:
                editText.setText("");
                break;
            case R.id.btncomma:
                editText.setText(number);
                break;
            case R.id.btnad:
                if (editText == null) {
                    editText.setText("");
                } else {
                    oldNumber = Double.parseDouble(editText.getText().toString());
                    addition = true;
                    editText.setText(null);
                }
                break;
            case R.id.btnsub:
                if (editText == null) {
                    editText.setText("");
                } else {
                    oldNumber = Double.parseDouble(editText.getText().toString());
                    subtraction = true;
                    editText.setText(null);
                }
                break;
            case R.id.btndiv:
                if (editText == null) {
                    editText.setText("");
                } else {
                    oldNumber = Double.parseDouble(editText.getText().toString());
                    division = true;
                    editText.setText(null);

                }
                break;
            case R.id.btnmul:
                if (editText == null) {
                    editText.setText("");
                } else {
                    oldNumber = Double.parseDouble(editText.getText().toString());
                    multiplication = true;
                    editText.setText(null);

                }
            case R.id.btneq:
                newNumber = Double.parseDouble(editText.getText().toString());

                if (addition == true) {
                    editText.setText(oldNumber + newNumber + "");
                    addition = false;
                }
                if(subtraction == true){
                    editText.setText(oldNumber - newNumber + "");
                    subtraction = false;
                }
                if(division == true){
                    editText.setText(oldNumber / newNumber + "");
                    division = false;
                }
                if(multiplication == true){
                    editText.setText(oldNumber*newNumber+"");
                    multiplication = false;
                }
        }

    }


}


