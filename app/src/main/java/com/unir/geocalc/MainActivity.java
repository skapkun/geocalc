package com.unir.geocalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnIniciar = findViewById(R.id.btn_calcular);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirSegundaActivity();
            }
        });
    }
    private void abrirSegundaActivity() {
        Intent intent = new Intent(this, segundaActivity.class);
        startActivity(intent);
    }
}