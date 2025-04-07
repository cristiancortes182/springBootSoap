package com.inicio.springwebservicesprueba.dto;

public class AsignaturaDTO {

    private  int idAsignatura;
    private String nombreAsignatura;
    private int creditos;

    public AsignaturaDTO() {
    }

    public AsignaturaDTO(int idAsignatura, String nombreAsignatura, int creditos) {
        this.idAsignatura = idAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.creditos = creditos;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
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
