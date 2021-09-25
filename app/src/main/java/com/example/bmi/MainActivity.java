package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText editheight ;
private EditText editweight ;
private TextView result ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editheight = findViewById(R.id.editheight);
        editweight = findViewById(R.id.editweight);
        result =findViewById(R.id.result) ;

    }
    public void calculateBMI(View view){
        double weight = Double.parseDouble(editweight.getText().toString()) ;
        double height = Double.parseDouble(editheight.getText().toString()) ;
        double bmi = weight/Math.pow((height/100),2) ;
        String str="BMI is "+bmi ;
        result.setText(str);
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}