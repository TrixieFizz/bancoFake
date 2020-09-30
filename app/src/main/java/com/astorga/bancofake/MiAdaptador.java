package com.astorga.bancofake;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolderDatos> {

    ArrayList<Clientes> lista_datos;

    public MiAdaptador(ArrayList<Clientes> lista_datos) {
        this.lista_datos = lista_datos;
    }

    @NonNull
    @Override
    public MiAdaptador.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_simple_item,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MiAdaptador.ViewHolderDatos holder, int position) {
        holder.texto.setText(lista_datos.get(position).getNombre());
        holder.texto2.setText(lista_datos.get(position).getRut());
        holder.texto3.setText(lista_datos.get(position).getGenero());
    }

    @Override
    public int getItemCount() {
        return lista_datos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView texto;
        TextView texto2;
        TextView texto3;


        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            texto = itemView.findViewById(R.id.texto1);
            texto2 = itemView.findViewById(R.id.texto2);
            texto3 = itemView.findViewById(R.id.texto3);

        }

    }
}
