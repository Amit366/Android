package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstnum,secondnum;
    TextView tans;
    Button add,sub,multiply,divide,power,percent,sine,cosine,tang,root,log,fact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnum=findViewById(R.id.edFirstNumber);
        secondnum=findViewById(R.id.edSecondNumber);
        tans=findViewById(R.id.edAns);
        add=findViewById(R.id.btAdd);
        sub=findViewById(R.id.btSub);
        multiply=findViewById(R.id.btMultiply);
        divide=findViewById(R.id.btDivide);
        power=findViewById(R.id.btPower);
        percent=findViewById(R.id.btPercent);
        sine=findViewById(R.id.btSin);
        cosine=findViewById(R.id.btCos);
        tang=findViewById(R.id.btTan);
        root=findViewById(R.id.btRoot);
        log=findViewById(R.id.btLog);
        fact=findViewById(R.id.btFact);

    }

    public void Add(View view) {

        float first,second,ans;
        first=Float.parseFloat(firstnum.getText().toString());
        second=Float.parseFloat(secondnum.getText().toString());
        ans=first+second;
        tans.setText("= "+ans);
    }

    public void Subb(View view) {
        float first,second,ans;
        first=Float.parseFloat(firstnum.getText().toString());
        second=Float.parseFloat(secondnum.getText().toString());
        ans=first-second;
        tans.setText("= "+ans);
    }

    public void Multi(View view) {
        float first,second,ans;
        first=Float.parseFloat(firstnum.getText().toString());
        second=Float.parseFloat(secondnum.getText().toString());
        ans=first*second;
        tans.setText("= "+ans);
    }

    public void divide(View view) {
        float first,second,ans;
        first=Float.parseFloat(firstnum.getText().toString());
        second=Float.parseFloat(secondnum.getText().toString());
        ans=first/second;
        tans.setText("= "+ans);
    }

    public void power(View view) {
        double first,second,ans;
        first=Double.parseDouble(firstnum.getText().toString());
        second=Double.parseDouble(secondnum.getText().toString());
        ans=Math.pow(first,second);
        tans.setText("= "+ ans);
    }

    public void percent(View view) {
        float first,ans;
        first=Float.parseFloat(firstnum.getText().toString());
        ans=first/100;
        tans.setText("= "+ans);
    }

    public void sin(View view) {
        double first,ans;
        first=Double.parseDouble(firstnum.getText().toString());
        ans=Math.sin(first);
        tans.setText("= "+ans);
    }

    public void cos(View view) {
        double first,ans;
        first=Double.parseDouble(firstnum.getText().toString());
        ans=Math.cos(first);
        tans.setText("= "+ans);
    }

    public void tan(View view) {
        double first,ans;
        first=Double.parseDouble(firstnum.getText().toString());
        ans=Math.tan(first);
        tans.setText("= "+ans);
    }

    public void root(View view) {

        double first,ans;
        first=Double.parseDouble(firstnum.getText().toString());
        ans=Math.sqrt(first);
        tans.setText("= "+ans);
    }

    public void log(View view) {
        double first,ans;
        first=Double.parseDouble(firstnum.getText().toString());
        ans=Math.log(first);
        tans.setText("= "+ans);
    }

    public void factorial(View view) {
        float first;
        first=Float.parseFloat(firstnum.getText().toString());
        int ans=1;
        for (int i=1;i<=first;i++){
            ans=ans*i;
        }
        tans.setText("= "+ans);
    }
}