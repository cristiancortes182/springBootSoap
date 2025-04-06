package com.inicio.springwebservicesprueba.dto;

public class AsignaturaDTO {

    private  int id_asignatura;
    private String nombreAsignatura;
    private int creditos;

    public AsignaturaDTO() {
    }

    public AsignaturaDTO(int id_asignatura, String nombreAsignatura, int creditos) {
        this.id_asignatura = id_asignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.creditos = creditos;
    }

    public int getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(int id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
