package com.iesvirgendelcarmen.dam.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonAñadir = (Button) findViewById(R.id.añadir);
        Button botonBorrar = (Button) findViewById(R.id.borrar);
        EditText nombre = (EditText) findViewById(R.id.editNombre);
        EditText apellidos = (EditText) findViewById(R.id.editApellidos);
        EditText telefono = (EditText) findViewById(R.id.editTelefono);
        EditText sexo = (EditText) findViewById(R.id.editSexo);

        botonAñadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        botonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }



}
