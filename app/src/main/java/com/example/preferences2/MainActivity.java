package com.example.preferences2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et_Nombre, et_Apellido, et_Contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_Nombre = (EditText) findViewById(R.id.et_Nombre);
        et_Apellido = (EditText) findViewById(R.id.et_Apellido);
        et_Contraseña = (EditText) findViewById(R.id.et_Contraseña);

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        et_Nombre.setText(preferences.getString("mail", ""));
    }
    public void guardar(View view){
        if(et_Nombre.getText().toString().isEmpty()){

            Toast.makeText(this, "Introduce el Nombre", Toast.LENGTH_SHORT).show();

        }
        if(et_Apellido.getText().toString().isEmpty()){

            Toast.makeText(this, "Introduce tu Apellido", Toast.LENGTH_SHORT).show();

        }
        if(et_Contraseña.getText().toString().isEmpty()){

            Toast.makeText(this, "Introduce tu Contraseña", Toast.LENGTH_SHORT).show();

        }
        else{




        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_editor = preferences.edit();
        Obj_editor.putString( "mail", et_Nombre.getText().toString());
        Obj_editor.commit();
        }
    }

}