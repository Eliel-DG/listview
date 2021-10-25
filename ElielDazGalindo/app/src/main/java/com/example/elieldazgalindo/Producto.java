package com.example.elieldazgalindo;

public class Producto {

    private String nombre;
    private int imagen;
    private float precio;
    private boolean oferta;

    public Producto(String nombre, int imagen, float precio, boolean oferta) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
        this.oferta = oferta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean isOferta() {
        return oferta;
    }
}

