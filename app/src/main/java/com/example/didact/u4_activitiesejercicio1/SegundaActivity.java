package com.example.didact.u4_activitiesejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);


        //Bundle obtiene los objetos que les son enviados
        Bundle b = getIntent().getExtras();

        if (b!=null){
            //el bundle recoje string porque el objeto que se le envio fue de tipo string, si fuera boolean seria getBoolean
            //Hemos llamado  a EXTRA NOMBRE
            String nombre = b.getString(MainActivity.EXTRA_NOMBRE);

            Toast.makeText(getApplicationContext(),"Nombre recogido "+nombre,
                    Toast.LENGTH_LONG).show();
        }
    }
}
