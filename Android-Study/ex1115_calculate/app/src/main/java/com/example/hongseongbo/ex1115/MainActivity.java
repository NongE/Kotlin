package com.example.hongseongbo.ex1115;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v) {

        EditText num1 = (EditText) findViewById(R.id.et1);
        EditText num2 = (EditText) findViewById(R.id.et2);

        TextView resu = (TextView) findViewById(R.id.result);

        try {

            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            resu.setText(Integer.toString(n1 + n2));

        }catch(NumberFormatException e)
        {
            resu.setText("숫자가 정상적으로 입력되지 않았습니다.");
        }

    }

    public void sub(View v) {

        EditText num1 = (EditText) findViewById(R.id.et1);
        EditText num2 = (EditText) findViewById(R.id.et2);

        TextView resu = (TextView) findViewById(R.id.result);

        try {

            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            resu.setText(Integer.toString(n1 - n2));

        }catch(NumberFormatException e)
        {
            resu.setText("숫자가 정상적으로 입력되지 않았습니다.");
        }


    }

    public void mul(View v) {

        EditText num1 = (EditText) findViewById(R.id.et1);
        EditText num2 = (EditText) findViewById(R.id.et2);

        TextView resu = (TextView) findViewById(R.id.result);

        try {

            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            resu.setText(Integer.toString(n1 * n2));

        }catch(NumberFormatException e)
        {
            resu.setText("숫자가 정상적으로 입력되지 않았습니다.");
        }


    }

    public void div(View v) {

        EditText num1 = (EditText) findViewById(R.id.et1);
        EditText num2 = (EditText) findViewById(R.id.et2);

        TextView resu = (TextView) findViewById(R.id.result);

        try {

            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            resu.setText(Integer.toString(n1 / n2));

        }catch(NumberFormatException e)
        {
            resu.setText("숫자가 정상적으로 입력되지 않았습니다.");
        }


    }

}
