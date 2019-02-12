package com.example.tpdm_u1_practica1_larretaorihuelabriansaid;

import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView primero,segundo;
    EditText n1,n2;
    Button calcular;
    Switch modo;
    RadioGroup opciones;
    RadioButton sumar,restar;
    RelativeLayout activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primero = findViewById(R.id.primer);
        segundo = findViewById(R.id.segundo);
        n1 = findViewById(R.id.op1);
        n2 = findViewById(R.id.op2);
        calcular = findViewById(R.id.btn);
        modo = findViewById(R.id.modo);
        opciones = findViewById(R.id.operacion);
        sumar = findViewById(R.id.suma);
        restar = findViewById(R.id.resta);
        activity =  findViewById(R.id.layout);
    }

    public void calculo(View c){
        int resultado;
        if(opciones.indexOfChild(opciones.findViewById(opciones.getCheckedRadioButtonId())) == 0) {
            resultado = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
        }else {
            resultado = Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString());
        }
        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setTitle("RESULTADO");
        alerta.setMessage("El resultado es : " + resultado);
        alerta.setPositiveButton("Aceptar", null);
        alerta.show();
    }

    public void modo(View c){
        if( modo.isChecked()){
            primero.setTextColor(Color.WHITE);
            segundo.setTextColor(Color.WHITE);
            activity.setBackgroundColor(Color.BLACK);
            sumar.setTextColor(Color.WHITE);
            restar.setTextColor(Color.WHITE);
            modo.setTextColor(Color.WHITE);
        }else{
            primero.setTextColor(Color.BLACK);
            segundo.setTextColor(Color.BLACK);
            n1.setTextColor(Color.BLACK);
            n2.setTextColor(Color.BLACK);
            activity.setBackgroundColor(Color.WHITE);
            sumar.setTextColor(Color.BLACK);
            restar.setTextColor(Color.BLACK);
            modo.setTextColor(Color.BLACK);
        }
    }
}
