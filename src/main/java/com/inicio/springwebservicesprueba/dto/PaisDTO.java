package com.inicio.springwebservicesprueba.dto;

public class PaisDTO {

    private int idPais;
    private String nombrePais;
    private String codigo;

    public PaisDTO() {
    }

    public PaisDTO(int idPais, String nombrePais, String codigo) {
        this.idPais = idPais;
        this.nombrePais = nombrePais;
        this.codigo = codigo;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
