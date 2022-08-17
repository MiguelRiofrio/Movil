package com.example.mies_dinapen.modelos;

public class Incidentes {

    private String id;
    private String logitud;
    private String latitud;
    private String hora;
    private String id_operador;

    public Incidentes(String id, String logitud, String latitud, String hora, String id_operador) {
        this.id = id;
        this.logitud = logitud;
        this.latitud = latitud;
        this.hora = hora;
        this.id_operador = id_operador;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogitud() {
        return logitud;
    }

    public void setLogitud(String logitud) {
        this.logitud = logitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getId_operador() {
        return id_operador;
    }

    public void setId_operador(String id_operador) {
        this.id_operador = id_operador;
    }
}
