package com.example.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    EditText editTextFirstNumber, editTextSecondNumber;
    TextView textViewAnswer;
    Button buttonPlus, buttonDivide, buttonMultiply, buttonMinus,buttonClear, buttonCalculate;

    boolean button1 = false;
    boolean button2 = false;
    boolean button3 = false;
    boolean button4 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        buttonLogic();
        buttonSet();

    }

    private void buttonLogic(){

        buttonDivide = findViewById(R.id.buttonDivide);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonPlus = findViewById(R.id.buttonPlus);

        buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonClear = findViewById(R.id.buttonClear);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button1 = true;
                if(button1){
                    buttonPlus.setBackgroundColor(Color.GREEN);
                    buttonPlus.setTextColor(Color.WHITE);

                    buttonMinus.setBackgroundColor(Color.GRAY);
                    buttonMinus.setTextColor(Color.WHITE);

                    buttonMultiply.setBackgroundColor(Color.GRAY);
                    buttonMultiply.setTextColor(Color.WHITE);

                    buttonDivide.setBackgroundColor(Color.GRAY);
                    buttonDivide.setTextColor(Color.WHITE);
                }
                button2 = false;
                button3 = false;
                button4 = false;

            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2 = true;
                if(button2){
                    buttonPlus.setBackgroundColor(Color.GRAY);
                    buttonPlus.setTextColor(Color.WHITE);

                    buttonMinus.setBackgroundColor(Color.GREEN);
                    buttonMinus.setTextColor(Color.WHITE);

                    buttonMultiply.setBackgroundColor(Color.GRAY);
                    buttonMultiply.setTextColor(Color.WHITE);

                    buttonDivide.setBackgroundColor(Color.GRAY);
                    buttonDivide.setTextColor(Color.WHITE);
                }
                button1 = false;
                button3 = false;
                button4 = false;
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3 = true;
                if(button3){
                    buttonPlus.setBackgroundColor(Color.GRAY);
                    buttonPlus.setTextColor(Color.WHITE);

                    buttonMinus.setBackgroundColor(Color.GRAY);
                    buttonMinus.setTextColor(Color.WHITE);

                    buttonMultiply.setBackgroundColor(Color.GREEN);
                    buttonMultiply.setTextColor(Color.WHITE);

                    buttonDivide.setBackgroundColor(Color.GRAY);
                    buttonDivide.setTextColor(Color.WHITE);
                }
                button1 = false;
                button2 = false;
                button4 = false;
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4 = true;
                if(button4){
                    buttonPlus.setBackgroundColor(Color.GRAY);
                    buttonPlus.setTextColor(Color.WHITE);

                    buttonMinus.setBackgroundColor(Color.GRAY);
                    buttonMinus.setTextColor(Color.WHITE);

                    buttonMultiply.setBackgroundColor(Color.GRAY);
                    buttonMultiply.setTextColor(Color.WHITE);

                    buttonDivide.setBackgroundColor(Color.GREEN);
                    buttonDivide.setTextColor(Color.WHITE);
                }
                button1 = false;
                button2 = false;
                button3 = false;
            }
        });

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateLogic();
                dismissKeyboard();
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearLogic();
                dismissKeyboard();
            }
        });


    }

    private void calculateLogic(){

        editTextFirstNumber = findViewById(R.id.editTextFirstNumber);
        editTextSecondNumber = findViewById(R.id.editTextSecondNumber);

        textViewAnswer = findViewById(R.id.textViewAnswer);

        String text1 = editTextFirstNumber.getText().toString().trim();
        String text2 = editTextSecondNumber.getText().toString().trim();

        double firstNumber = 0;
        double secondNumber = 0;

        boolean errorAnswer = false;

        if(text1.equals("") || text2.equals("")){
            errorAnswer = true;
            textViewAnswer.setText("Please, Enter Numbers!");
        }
        else if(text1.equals("")){
            errorAnswer = true;
            textViewAnswer.setText("Please, Enter Numbers!");
        }
        else if(text2.equals("")){
            errorAnswer = true;
            textViewAnswer.setText("Please, Enter Numbers!");
        }
        else{
            double firstNumber1 = Double.parseDouble(editTextFirstNumber.getText().toString());
            double secondNumber2 = Double.parseDouble(editTextSecondNumber.getText().toString());

            firstNumber = firstNumber1;
            secondNumber = secondNumber2;

            errorAnswer = false;
        }

        double answer = 0;





        if(button1){
            answer = firstNumber + secondNumber;

        }
        if(button2){
            answer = firstNumber - secondNumber;

        }
        if(button3){
            answer = firstNumber * secondNumber;

        }
        if(button4){
            answer = firstNumber / secondNumber;

        }
        if (!errorAnswer){
            textViewAnswer.setText(String.valueOf(answer));
        }


    }

    private void clearLogic(){
        editTextFirstNumber = findViewById(R.id.editTextFirstNumber);
        editTextSecondNumber = findViewById(R.id.editTextSecondNumber);

        textViewAnswer = findViewById(R.id.textViewAnswer);

        editTextFirstNumber.setText("");
        editTextSecondNumber.setText("");
        textViewAnswer.setText("Answer");

        buttonSet();

    }

    private void buttonSet(){

        buttonDivide = findViewById(R.id.buttonDivide);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonPlus = findViewById(R.id.buttonPlus);

        buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonClear = findViewById(R.id.buttonClear);

        buttonPlus.setBackgroundColor(Color.GRAY);
        buttonPlus.setTextColor(Color.WHITE);

        buttonMinus.setBackgroundColor(Color.GRAY);
        buttonMinus.setTextColor(Color.WHITE);

        buttonMultiply.setBackgroundColor(Color.GRAY);
        buttonMultiply.setTextColor(Color.WHITE);

        buttonDivide.setBackgroundColor(Color.GRAY);
        buttonDivide.setTextColor(Color.WHITE);

        button1 = false;
        button2 = false;
        button3 = false;
        button4 = false;

    }

    private void dismissKeyboard(){

    }
}
