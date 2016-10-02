package com.example.android.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv;
    EditText ed1,ed2;
    Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.edittext1);
        ed2=(EditText)findViewById(R.id.edittext2);
        tv=(TextView)findViewById(R.id.result);

        btn1=(Button)findViewById(R.id.add);
        btn2=(Button)findViewById(R.id.sub);
        btn3=(Button)findViewById(R.id.mul);
        btn4=(Button)findViewById(R.id.div);
        btn5=(Button)findViewById(R.id.equals);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        float num1=0;
        float num2=0;
        float result=0;


        num1=Float.parseFloat(ed1.getText().toString());
        num2=Float.parseFloat(ed2.getText().toString());

        if(TextUtils.isEmpty(ed1.getText().toString())||(TextUtils.isEmpty(ed2.getText().toString()))){
            return;
        }
        switch(view.getId()){

            case R.id.add:
                result=num1+num2;
                break;
            case R.id.sub:
                result=num1-num2;
                break;
            case R.id.mul:
                result=num1*num2;
                break;
            case R.id.div:
                if(num2!=0)
                result=num1/num2;
                break;
            default:
                break;



        }
        tv.setText("Result=  "+result);
    }
}
