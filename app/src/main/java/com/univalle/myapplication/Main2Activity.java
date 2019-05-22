package com.univalle.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button atras, calcular;
    TextView resultado;
    EditText unidades;
    Double unidad, resultad;
    String valor, codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        atras = (Button)findViewById(R.id.btnatras);
        calcular = (Button)findViewById(R.id.btncalcular);
        resultado = (TextView) findViewById(R.id.txtResultado);
        unidades = (EditText)findViewById(R.id.etxtunidad);
        codigo = getIntent().getStringExtra("codigo");

        switch (codigo){
            //Temperatura
            case "1":
                this.setTitle(R.string.btnCelsiusFahrenheit);
                break;
            case "2":
                this.setTitle(R.id.btnFahrenheitCelcius);
                break;
            case "3":
                this.setTitle(R.id.btnCelsiusKelvin);
                break;
            case "4":
                this.setTitle(R.id.btnDKelvinCelsius);
                break;
            case "5":
                this.setTitle(R.id.btnMeterCentimeter);
                break;
            case "6":
                this.setTitle(R.id.btnMeterCentimeter);
                break;
            case "7":
                this.setTitle(R.id.btnCentimeterInch);
                break;
            case "8":
                this.setTitle(R.id.btnInchCentimeter);
                break;
        }
        cargarPreferencias();
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarPreferencias();
                ///////////////////////////////////////////////////Uso de try-catch/////////////////
                try {
                    String auxiliar = unidades.getText().toString();
                    unidad = Double.parseDouble(auxiliar);
                }catch (NumberFormatException nfe){}

                switch (codigo){
                    case "1":
                        resultad = (unidad * 1.8) + 32;
                        valor = String.valueOf(resultad);
                        resultado.setText(valor+" Fº");
                        break;
                    case "2":
                        resultad = (unidad - 32) / 1.8;
                        valor = String.valueOf(resultad);
                        resultado.setText(valor + " Cº");
                        break;
                    case "3":
                        resultad = 273.15 + unidad;
                        valor = String.valueOf(resultad);
                        resultado.setText(valor + " Kº");
                        break;
                    case "4":
                        resultad = unidad - 273.15;
                        valor = String.valueOf(resultad);
                        resultado.setText(valor + " Cº");
                        break;
                    case "5":
                        resultad=unidad*100;
                        valor=String.valueOf(resultad);
                        resultado.setText(valor+" cm");
                        break;
                    case "6":
                        resultad=unidad/100;
                        valor=String.valueOf(resultad);
                        resultado.setText(valor+" m");
                        break;
                    case "7":
                        resultad=unidad*0.39370;
                        valor=String.valueOf(resultad);
                        resultado.setText(valor+" inch");
                        break;
                    case "8":
                        resultad=unidad*2.54;
                        valor=String.valueOf(resultad);
                        resultado.setText(valor+" cm");
                        break;
                }
            }
        });
        //Boton para volver atras a la primera actividad...
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Main2Activity.this, MainActivity.class));
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void cargarPreferencias(){
        SharedPreferences preferencia = getSharedPreferences("Mis datos...", Context.MODE_PRIVATE);
        String ultimoNumero = preferencia.getString("Nombre", "No existe...");
        unidades.setText(ultimoNumero);
    }
    private void guardarPreferencias(){
        SharedPreferences preferencia = getSharedPreferences("Mis datos...", Context.MODE_PRIVATE);
        String UltimoNumero = unidades.getText().toString();
        SharedPreferences.Editor editor = preferencia.edit();
        editor.putString("Nombre", UltimoNumero);
        unidades.setText(UltimoNumero);
        editor.commit();
    }
}
