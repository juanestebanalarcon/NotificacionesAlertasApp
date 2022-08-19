package com.uao.notificacionesalertasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity {

    EditText name,lastName;
    Button btn_enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.nombre);
        lastName = findViewById(R.id.apellido);
        btn_enviar = findViewById(R.id.btn_pasar);
        btn_enviar.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,segundaActivity.class);
                i.putExtra("nombre",name.getText().toString());
                i.putExtra("apellido",lastName.getText().toString());
                startActivity(i);
            }
        });

    }
}