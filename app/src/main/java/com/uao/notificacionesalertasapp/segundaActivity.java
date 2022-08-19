package com.uao.notificacionesalertasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
public class segundaActivity extends AppCompatActivity {

    private TextView nombres,apellidos;
    private Button btn_nueva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        nombres = findViewById(R.id.nombres);
        apellidos = findViewById(R.id.apellidos);
        btn_nueva = findViewById(R.id.btn_nueva);
        btn_nueva.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(segundaActivity.this,NotificacionesAlertasActivity.class);
                startActivity(i);
            }
        });
        //capturamos los datos de la primera activity
        String nombres_,apellidos_;
        nombres_ = getIntent().getStringExtra("nombre");
        apellidos_ = getIntent().getStringExtra("apellido");
        nombres.setText(nombres_);
        apellidos.setText(apellidos_);
    }
}