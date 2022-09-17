package com.cesar.passper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaFase extends AppCompatActivity {
    Button btnVoltar,btnTerceiraFase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_fase);

        btnTerceiraFase=findViewById(R.id.btnTerceiraFase);

        btnVoltar=findViewById(R.id.btnVoltar);

        btnTerceiraFase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TerceiraFase= new Intent(getApplicationContext(), TerceiraFase.class);
                startActivity(TerceiraFase);
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