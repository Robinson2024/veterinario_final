package com.example.sqllite;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

public class Inicio extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        progressBar = findViewById(R.id.progressBar);
    }

    public void Iniciar(View view) {
        // Mostrar el ProgressBar
        progressBar.setVisibility(View.VISIBLE);

        // Retrasar la ejecución de la actividad MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Iniciar la actividad después de 3 segundos
                Intent iniciar = new Intent(Inicio.this, MainActivity.class);
                startActivity(iniciar);

                // Ocultar el ProgressBar después de iniciar la actividad
                progressBar.setVisibility(View.INVISIBLE);
            }
        }, 3000); // Retraso de 3 segundos (3000 milisegundos)
    }

    public void Maps(View v){
        Intent i = new Intent(this, Maps.class);
        startActivity(i);
    }



}