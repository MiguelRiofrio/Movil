package com.example.mies_dinapen.modelos;

public class Operadores {
    private String id;
    private String cedular;
    private String nombre;
    private String apellido;
    private String clave;

    public Operadores (String id, String cedular, String nombre, String apellido, String clave) {
        this.id = id;
        this.cedular = cedular;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCedular() {
        return cedular;
    }

    public void setCedular(String cedular) {
        this.cedular = cedular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Operadores{" +
                "id='" + id + '\'' +
                ", cedular='" + cedular + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}
