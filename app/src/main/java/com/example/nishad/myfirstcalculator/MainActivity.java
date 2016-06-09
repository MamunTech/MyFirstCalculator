package com.example.nishad.myfirstcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private Button btnZero;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnMultiply;
    private Button btnDivide;
    private Button btnPoint;
    private Button btnEqual;
    private Button btnClear;
    private Button btnPlusMinus;
    private Button btnRoot;
    private Button btnMode;

    String currentText, operator, result;
    int digitCount;
    double currentNumber;
    boolean pointFound, equalPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.display);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnPlusMinus = (Button) findViewById(R.id.btnPlusMinus);
        btnRoot = (Button) findViewById(R.id.btnRoot);
        btnMode = (Button) findViewById(R.id.btnMode);

        currentText = "";
        digitCount = 0;
        pointFound = false;
        equalPressed = false;
    }

    public void digitClick(View view) {
        if(digitCount < 12) {
            Button b = (Button) view;
            String buttonText = b.getText().toString();
            if(digitCount == 0) {
                display.setText("");
            }
            if(equalPressed) {
                currentText = "";
                display.setText("");
                equalPressed = false;
            }
            String oldText = display.getText().toString();
            currentText = oldText + buttonText;
            display.setText(currentText);
            digitCount++;
        }
    }

    public void clearClick(View view) {
        display.setText("");
        pointFound = false;
        equalPressed = false;
        currentText = "";
        currentNumber = 0;
        digitCount = 0;
    }

    public void pointClick(View view) {
        if(!pointFound) {
            if(digitCount < 15) {
                currentText += ".";
                display.setText(currentText);
                pointFound = true;
                digitCount++;
            }
        }
    }

    public void operatorClick(View view) {
        try {
            Button b = (Button) view;
            operator = b.getText().toString();
            display.setText(operator);
            currentNumber += Double.parseDouble(currentText);
            currentText = "";
            digitCount = 0;
        } catch (Exception e) {

        }
    }

    public void equalClick(View view) {
        try {
            Double newNumber = Double.parseDouble(currentText);
            switch (operator) {
                case "+":
                    currentNumber += newNumber;
                    break;
                case "-":
                    currentNumber -= newNumber;
                    break;
                case "X":
                    currentNumber *= newNumber;
                    break;
                case "÷":
                    currentNumber /= newNumber;
                    break;
                case "%":
                    currentNumber %= newNumber;
                    break;
                default:
                    break;
            }
            display.setText("= " + currentNumber);
            currentText = "" + currentNumber;
            equalPressed = true;
        } catch (Exception e) {

        }
    }

}
