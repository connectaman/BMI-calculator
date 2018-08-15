package com.example.amanulla.bmi_calci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void buttonClicked(View w)
    {
        EditText editTextHight = (EditText) findViewById(R.id.height);
        EditText editTextWeight = (EditText) findViewById(R.id.weight);
        TextView textViewresult = (TextView) findViewById(R.id.userBMI);
        double height=Double.parseDouble(editTextHight.getText().toString());
        double weight=Double.parseDouble(editTextWeight.getText().toString());
        double bmi=(weight/(height*height));
        textViewresult.setText("The BMI = "+Double.toString(bmi));

    }

}

