//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.04.04 a las 05:04:28 PM COT 
//


package com.ejemplo.school;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "estudiante"
})
@XmlRootElement(name = "GuardarEstudianteRequest")
public class GuardarEstudianteRequest {

    @XmlElement(required = true)
    protected Estudiante estudiante;


    public Estudiante getEstudiante() {
        return estudiante;
    }


    public void setEstudiante(Estudiante value) {
        this.estudiante = value;
    }

}
