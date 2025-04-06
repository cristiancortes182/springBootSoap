//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.04.04 a las 05:04:28 PM COT 
//


package com.ejemplo.school;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Clase Java para ListaEstudiantes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListaEstudiantes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estudiante" type="{http://ejemplo.com/school}Estudiante" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaEstudiantes", propOrder = {
    "estudiante"
})
@XmlRootElement(name = "ListaEstudiantes")
public class ListaEstudiantes {

    @XmlElement(required = true)
    protected List<Estudiante> estudiante;


    public List<Estudiante> getEstudiante() {
        if (estudiante == null) {
            estudiante = new ArrayList<Estudiante>();
        }
        return this.estudiante;
    }

}
