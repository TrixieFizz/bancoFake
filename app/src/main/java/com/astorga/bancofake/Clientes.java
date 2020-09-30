package com.astorga.bancofake;

public class Clientes {

    String Nombre;
    String Rut;
    String Genero;


    public Clientes()
    {

    }

    public Clientes(String nombre, String rut, String genero) {
        Nombre = nombre;
        Rut = rut;
        Genero = genero;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String rut) {
        Rut = rut;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

}
