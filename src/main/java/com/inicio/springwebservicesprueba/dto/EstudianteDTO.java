package com.inicio.springwebservicesprueba.dto;

public class EstudianteDTO {

    private int idStudiante;
    private String nombre;
    private String apellido;
    private String correo;
    private int edad;
    private int fkPais;

    public EstudianteDTO( String nombre, String apellido, String correo, int edad, int fkPais) {
        this.idStudiante = idStudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.edad = edad;
        this.fkPais = fkPais;
    }



    public int getFkPais() {
        return fkPais;
    }

    public void setFkPais(int fkPais) {
        this.fkPais = fkPais;
    }

    public EstudianteDTO(int idStudiante) {
        this.idStudiante = idStudiante;
    }

    public int getIdStudiante() {
        return idStudiante;
    }

    public void setIdStudiante(int idStudiante) {
        this.idStudiante = idStudiante;
    }

    public EstudianteDTO() {
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
