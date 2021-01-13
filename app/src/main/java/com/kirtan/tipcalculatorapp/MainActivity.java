package com.kirtan.tipcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.net.CookieHandler;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity  {

    public EditText editText;
    public EditText editText2;
    public TextView tipVal;
    public float fullAm;
    public float tipAm;
    public float fullVal;
    public String fullResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);

        tipVal = (TextView) findViewById(R.id.endTip);


    }

    public void calVal(View y) {

        fullAm = Integer.parseInt(editText.getText().toString());
        tipAm = Integer.parseInt(editText2.getText().toString());
        fullVal = (int)(fullAm*(tipAm/100.0f));
        String fullResult = String.format("%.03f", fullVal);

        tipVal.setText("Your tip amount is: " + fullResult + "$");
    }

    }




