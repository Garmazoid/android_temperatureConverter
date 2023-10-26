package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button convTo_F = findViewById(R.id.convert_toF);
        convTo_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // °F = (°C × 9/5) + 32
                try {
                    int C = Integer.parseInt(((EditText)findViewById(R.id.temperature_C)).getText().toString());
                    ((EditText)findViewById(R.id.temperature_F)).setText("" +  ((C * (9F/5F)) + 32) );
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Недопустимое значение", Toast.LENGTH_LONG).show();
                }
            }
        });


        Button convTo_C = findViewById(R.id.convert_toC);
        convTo_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // °C = (°F − 32) × 5/9
                try {
                    int F = Integer.parseInt(((EditText)findViewById(R.id.temperature_F)).getText().toString());
                    ((EditText)findViewById(R.id.temperature_C)).setText("" + ((F - 32) * (5F/9F)) );
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Недопустимое значение", Toast.LENGTH_LONG).show();
                }
            }
        });


        Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((EditText)findViewById(R.id.temperature_F)).setText("");
                ((EditText)findViewById(R.id.temperature_C)).setText("");
            }
        });
    }
}