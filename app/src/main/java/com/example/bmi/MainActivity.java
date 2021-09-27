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
    private TextView type ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editheight = findViewById(R.id.editheight);
        editweight = findViewById(R.id.editweight);
        result =findViewById(R.id.result) ;
        type =findViewById(R.id.type);

    }

   public void calculateBMI(View view){
       if(isNumeric(editweight.getText().toString()) && isNumeric(editweight.getText().toString())) {
           double weight = Double.parseDouble(editweight.getText().toString());
           double height = Double.parseDouble(editheight.getText().toString());
           double bmi = weight / Math.pow((height / 100), 2);
           String str = "BMI is " + bmi;
           result.setText(str);
           Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
           if (bmi < 18.5) {
               type.setText("Underweight");

           } else if (bmi >= 18.5 && bmi < 25) {
               type.setText("Normal Weight");
           } else if (bmi >= 25 && bmi < 30) {
               type.setText("Overweight");
           } else {
               type.setText("Obese");

           }
       }else {
           result.setText("please enter a number");
       }

   }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}