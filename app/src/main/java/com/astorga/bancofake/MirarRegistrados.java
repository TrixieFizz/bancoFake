package com.astorga.bancofake;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MirarRegistrados extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<Clientes> lishaClients;
    MainActivity Ma;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirar_registrados);

        recycler = findViewById(R.id.recycler);

        String nombre = getIntent().getStringExtra("nombre");
        String rut= getIntent().getStringExtra("rut");
        String genero= getIntent().getStringExtra("genero");

        lishaClients = new ArrayList<>();
        lishaClients.add(new Clientes(nombre,rut,genero));
        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        MiAdaptador adaptor = new MiAdaptador(lishaClients);

        recycler.setAdapter(adaptor);



    }

}