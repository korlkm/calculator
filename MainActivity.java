package com.example.tutituter;
import androidx.appcompat.app.AppCompatActivity;

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

    public void addClick(View v) {
        // number1 이라고 이름을 붙힌 id에 editText를 받아서 number1이라는 객체에 받는다.
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result =  (TextView) findViewById(R.id.result);
        // number1이 n1에 parseInt라는 함수를 통해 저장된다
        // number1의 값을 getText().toString()을 통해 문자열로 text를 받게 된다.
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        // Integer.toString이란 정수를 문자열로 바꾸게 해주는 것이다,
        result.setText(Integer.toString(n1+n2));
    }

    public void subtractClick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result =  (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1-n2));
    }

    public void multiplylick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result =  (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1*n2));
    }

    public void divideClick(View v) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result =  (TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1/n2));
    }
}