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

    String firstNumber, secondNumber, result;

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

        firstNumber = "";
    }

    public void digitClick(View view) {
        Button b = (Button) view;
        String buttonText = b.getText().toString();
        firstNumber += buttonText;
        display.setText(firstNumber);
    }

    public void clearClick(View view) {
        display.setText("");
    }

}
