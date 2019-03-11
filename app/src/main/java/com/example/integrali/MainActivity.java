package com.example.integrali;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button calcola;
    EditText estrA, estrB, numint;
    TextView risultato;
    Spinner spint;
    EditText insFunz;
    Expression e;


    private double f (double x) {
        //int n = spint.getSelectedItemPosition();

        e.setVariable("x", x);
        return e.evaluate();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcola = findViewById(R.id.calcola);
        estrA = findViewById(R.id.estrA);
        estrB = findViewById(R.id.estrB);
        numint = findViewById(R.id.numint);
        risultato = findViewById(R.id.risultato);
        spint = findViewById(R.id.spint);
        insFunz = findViewById(R.id.insFunz);


        calcola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                InputMethodManager inputManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);


                a = Double.parseDouble(estrA.getText().toString());
                b = Double.parseDouble(estrB.getText().toString());
                n = Integer.parseInt(numint.getText().toString());


                DecimalFormat df = new DecimalFormat("#.######");
                risultato.setText(df.format(area));
            }


        });

    }
}