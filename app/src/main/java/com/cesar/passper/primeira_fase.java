package com.cesar.passper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class primeira_fase extends AppCompatActivity {
    Button btnVoltar,btnSegundaFase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_fase);

        btnSegundaFase=findViewById(R.id.btnSegundaFase);

        btnVoltar=findViewById(R.id.btnVoltar);

        btnSegundaFase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SegundaFase= new Intent(getApplicationContext(), SegundaFase.class);
                startActivity(SegundaFase);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}