package com.astorga.bancofake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BancoRegister extends AppCompatActivity {

    EditText txt_Nombre,txt_Rut,txt_Contraseña;
    Button btn_register;
    CheckBox Cb_condiciones;
    RadioGroup Rg_genro;

    String nombre;
    String rut;
    String contraseña;
    String repetirContraseña;
    String genero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banco_register);

        txt_Nombre = findViewById(R.id.txt_Nombre);
        txt_Rut = findViewById(R.id.txt_Rut);
        txt_Contraseña = findViewById(R.id.txt_Contraseña);
        btn_register = findViewById(R.id.btn_RegistrarRegistro);
        Cb_condiciones = findViewById(R.id.checkCondisiones);
        Rg_genro = findViewById(R.id.radioGroup);

        Rg_genro.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (R.id.RbHombre == checkedId)
                {
                    genero = "hombre";
                }else if (R.id.RbMujer == checkedId)
                {
                    genero = "Mujer";
                }else
                    {
                        genero = "Otros";
                    }
            }
        });





        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                nombre = txt_Nombre.getText().toString();
                rut = txt_Rut.getText().toString();
                contraseña = txt_Contraseña.getText().toString();



                Intent intento = new Intent(BancoRegister.this, MirarRegistrados.class);
                intento.putExtra("nombre",nombre);
                intento.putExtra("rut",rut);
                intento.putExtra("genero",genero);

                startActivity(intento);
            }
        });

    }


}