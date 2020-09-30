package com.astorga.bancofake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn_registrar, btn_MirarRegistrados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_registrar = findViewById(R.id.btn_Registrar);
        btn_MirarRegistrados = findViewById(R.id.btn_MirarRegistrados);





        btn_registrar.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intento = new Intent(MainActivity.this, BancoRegister.class);
                                                 startActivity(intento);
                                             }
                                         }

        );

        btn_MirarRegistrados.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent intento = new Intent(MainActivity.this, MirarRegistrados.class);
                                                 startActivity(intento);
                                             }
                                         }

        );
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}