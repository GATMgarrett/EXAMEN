package com.univalle.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCelsiusFahrenheit, btnFahrenheitCelsius, btnCelsiusKelvin, btnKelvinClesius;
    Button btnMeterCentimeter, btnCentimeterMeter, btncentimeterInch, btnInchCentimeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Temperatura
        btnCelsiusFahrenheit = (Button)findViewById(R.id.btnCelsiusFahrenheit);
        btnFahrenheitCelsius = (Button)findViewById(R.id.btnFahrenheitCelcius);
        btnCelsiusKelvin = (Button)findViewById(R.id.btnCelsiusKelvin);
        btnKelvinClesius = (Button)findViewById(R.id.btnDKelvinCelsius);
        //Distancia
        btnMeterCentimeter = (Button)findViewById(R.id.btnMeterCentimeter);
        btnCentimeterMeter = (Button)findViewById(R.id.btnCentimeterMeter);
        btncentimeterInch = (Button)findViewById(R.id.btnCentimeterInch);
        btnInchCentimeter = (Button)findViewById(R.id.btnInchCentimeter);

        //Temperatura
        btnCelsiusFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("codigo","1");
                startActivity(intent);
                finish();
                //startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
        btnFahrenheitCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("codigo","2");
                startActivity(intent);
                finish();
            }
        });
        btnCelsiusKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("codigo","3");
                startActivity(intent);
                finish();
            }
        });
        btnKelvinClesius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("codigo","4");
                startActivity(intent);
                finish();
            }
        });
        //Distancia
        btnMeterCentimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("codigo","5");
                startActivity(intent);
                finish();
            }
        });
        btnCentimeterMeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("codigo","6");
                startActivity(intent);
                finish();
            }
        });
        btncentimeterInch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("codigo","7");
                startActivity(intent);
                finish();
            }
        });
        btnInchCentimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("codigo","8");
                startActivity(intent);
                finish();
            }
        });
    }
}
