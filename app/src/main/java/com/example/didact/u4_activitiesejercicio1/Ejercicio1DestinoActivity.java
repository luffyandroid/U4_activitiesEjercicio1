package com.example.didact.u4_activitiesejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio1DestinoActivity extends AppCompatActivity {
    TextView tvNombre, tvApellido, tvEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1_destino);

        tvNombre = (TextView)findViewById(R.id.tvNombre);
        tvApellido = (TextView)findViewById(R.id.tvApellido);
        tvEdad = (TextView)findViewById(R.id.tvEdad);

        Bundle b = getIntent().getExtras();
        if (b!=null){
            String nombre = b.getString(Ejercicio1Activity.EXTRA_NOMBRE);
            String apellido = b.getString(Ejercicio1Activity.EXTRA_APELLIDO);
            int edad = b.getInt(Ejercicio1Activity.EXTRA_EDAD);

            tvNombre.setText(nombre);
            tvApellido.setText(apellido);
            tvEdad.setText(edad+"");
        }

    }
}
