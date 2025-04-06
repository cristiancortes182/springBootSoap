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
 * <p>Clase Java para Estudiante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Estudiante"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_estudiante" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fk_pais" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Estudiante", propOrder = {
    "idEstudiante",
    "nombre",
    "apellido",
    "correo",
    "edad",
    "fkPais"
})
public class Estudiante {

    @XmlElement(name = "id_estudiante")
    protected int idEstudiante;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String apellido;
    @XmlElement(required = true)
    protected String correo;
    protected int edad;
    @XmlElement(name = "fk_pais")
    protected int fkPais;

    /**
     * Obtiene el valor de la propiedad idEstudiante.
     * 
     */
    public int getIdEstudiante() {
        return idEstudiante;
    }

    /**
     * Define el valor de la propiedad idEstudiante.
     * 
     */
    public void setIdEstudiante(int value) {
        this.idEstudiante = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     */
    public void setEdad(int value) {
        this.edad = value;
    }

    /**
     * Obtiene el valor de la propiedad fkPais.
     * 
     */
    public int getFkPais() {
        return fkPais;
    }

    /**
     * Define el valor de la propiedad fkPais.
     * 
     */
    public void setFkPais(int value) {
        this.fkPais = value;
    }

}
