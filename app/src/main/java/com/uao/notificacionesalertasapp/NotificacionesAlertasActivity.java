package com.uao.notificacionesalertasapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NotificacionesAlertasActivity extends AppCompatActivity {

    private Button btn_alertBuilder, btn_alert, btn_toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones_alertas);
        btn_alert = findViewById(R.id.btn_alert);
        btn_alertBuilder=findViewById(R.id.btn_alertBuilder);
        btn_toast = findViewById(R.id.btn_toast);

        btn_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){onClick_DialogBuilder(v);}
        });
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){onClick_toast(v);}
        });
        btn_alertBuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){eleccion("Mensaje","Titulo");}
        });
    }
    //funciones
    public void onClick_toast(View v){
        mensaje("Se presionó el toast");
    }
    public void mensaje(String cadena){
        Toast.makeText(this,cadena,Toast.LENGTH_SHORT).show();
    }
    public void onClick_DialogBuilder(View v){
        alerta("Este es dialog builder.","Dialog Builder");
    }
    public void alerta(String cadena,String titulo){
        AlertDialog.Builder dialog_builder = new AlertDialog.Builder(this);
        dialog_builder.setMessage(cadena);
        dialog_builder.setTitle(titulo);
        dialog_builder.setCancelable(true);
        dialog_builder.create().show();


    }
    public void eleccion(String cadena,String title){
        AlertDialog.Builder alertBox = new AlertDialog.Builder(this);
        alertBox.setTitle(title);
        alertBox.setMessage(cadena);
        alertBox.setPositiveButton("Sí", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface arg0, int arg1){
                mensaje("Pulsando botón sí.");
            }
        });
        alertBox.setNegativeButton("No",new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface arg0, int arg1){
                mensaje("Pulsando botón no.");
            }
        });
        alertBox.show();
    }
}