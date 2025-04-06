package com.inicio.springwebservicesprueba.repository;

public class Estudiante {


    String nombre;
    String apellido;
    String correo;

    public Estudiante(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public Estudiante(String nombre, int edad) {
    }

    public Estudiante(String nombre, String apellido) {
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

    public Estudiante() {
    }
}
