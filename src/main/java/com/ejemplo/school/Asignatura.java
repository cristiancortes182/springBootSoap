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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Asignatura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Asignatura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_asignatura" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre_asignatura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="creditos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asignatura", propOrder = {
    "idAsignatura",
    "nombreAsignatura",
    "creditos"
})
public class Asignatura {

    @XmlElement(name = "id_asignatura")
    protected int idAsignatura;
    @XmlElement(name = "nombre_asignatura", required = true)
    protected String nombreAsignatura;
    protected int creditos;

    /**
     * Obtiene el valor de la propiedad idAsignatura.
     * 
     */
    public int getIdAsignatura() {
        return idAsignatura;
    }

    /**
     * Define el valor de la propiedad idAsignatura.
     * 
     */
    public void setIdAsignatura(int value) {
        this.idAsignatura = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAsignatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    /**
     * Define el valor de la propiedad nombreAsignatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAsignatura(String value) {
        this.nombreAsignatura = value;
    }

    /**
     * Obtiene el valor de la propiedad creditos.
     * 
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * Define el valor de la propiedad creditos.
     * 
     */
    public void setCreditos(int value) {
        this.creditos = value;
    }

}
