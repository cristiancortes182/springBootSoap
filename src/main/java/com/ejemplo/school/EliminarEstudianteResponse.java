


package com.ejemplo.school;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mensaje"
})
@XmlRootElement(name = "EliminarEstudianteResponse")
public class EliminarEstudianteResponse {

    @XmlElement(required = true)
    protected String mensaje;


    public String getMensaje() {
        return mensaje;
    }


    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
