package com.example.didact.u4_activitiesejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Ejercicio1Activity extends AppCompatActivity {


    //siempre sera igual esto--> static final String EXTRA_
    static final String EXTRA_NOMBRE = "NOMBRE";
    static final String EXTRA_APELLIDO = "APELLIDO";
    static final String EXTRA_EDAD = "EDAD";
    EditText etNombre, etApellido, etEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        etNombre = (EditText)findViewById(R.id.etNombre);
        etApellido = (EditText)findViewById(R.id.etApellido);
        etEdad = (EditText)findViewById(R.id.etEdad);


    }

    public void aceptar(View view){

        String nombre = etNombre.getText().toString();
        String apellido = etApellido.getText().toString();
        String cajaedad = etEdad.getText().toString();

        if (nombre.equals("") || apellido.equals("") || cajaedad.equals("")){

            Toast.makeText(getApplicationContext(),"Debes rellenar los campos",
                    Toast.LENGTH_LONG).show();

        }else{
            int edad = Integer.parseInt(cajaedad);

            Intent i = new Intent(getApplicationContext(),
                    Ejercicio1DestinoActivity.class);
            i.putExtra(EXTRA_NOMBRE, nombre);
            i.putExtra(EXTRA_APELLIDO, apellido);
            i.putExtra(EXTRA_EDAD,edad);
            startActivity(i);
        }


    }


}
