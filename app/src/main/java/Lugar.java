package com.example.silvestreando2026;

public class Lugar {
    private final String nombre;
    private final String departamento;
    private final String descripcion;
    private final int imagen;

    public Lugar(String nombre, String departamento, String descripcion, int imagen) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() { return nombre; }
    public String getDepartamento() { return departamento; }
    public String getDescripcion() { return descripcion; }
    public int getImagen() { return imagen; }
}