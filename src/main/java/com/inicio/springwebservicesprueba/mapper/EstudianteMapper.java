package com.inicio.springwebservicesprueba.mapper;


import com.ejemplo.school.Asignatura;
import com.ejemplo.school.Estudiante;
import com.inicio.springwebservicesprueba.dto.AsignaturaDTO;
import com.inicio.springwebservicesprueba.dto.EstudianteDTO;
import org.springframework.stereotype.Component;

@Component
public class EstudianteMapper {

    public EstudianteDTO toDTO(Estudiante estudiante) {
        if(estudiante == null) return null;

        EstudianteDTO estudianteDTO = new EstudianteDTO();
        estudianteDTO.setNombre(estudiante.getNombre());
        estudianteDTO.setApellido(estudiante.getApellido());
        estudianteDTO.setEdad(estudiante.getEdad());
        estudianteDTO.setCorreo(estudiante.getCorreo());
        estudianteDTO.setFkPais(estudiante.getFkPais());

        return estudianteDTO;

    }


    public Estudiante toXml(EstudianteDTO estudianteDTO) {
        if(estudianteDTO == null) return null;

        Estudiante estudianteXml = new Estudiante();
        estudianteXml.setNombre(estudianteDTO.getNombre());
        estudianteXml.setApellido(estudianteDTO.getApellido());
        estudianteXml.setEdad(estudianteDTO.getEdad());
        estudianteXml.setCorreo(estudianteDTO.getCorreo());
        estudianteXml.setFkPais(estudianteDTO.getFkPais());
        return estudianteXml;


    }



}
