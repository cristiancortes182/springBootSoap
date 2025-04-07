package com.inicio.springwebservicesprueba.mapper;

import com.ejemplo.school.Asignatura;
import com.ejemplo.school.Estudiante;
import com.inicio.springwebservicesprueba.dto.AsignaturaDTO;
import com.inicio.springwebservicesprueba.dto.EstudianteDTO;
import org.springframework.stereotype.Component;

@Component
public class AsignaturaMapper {



    public AsignaturaDTO toDTO(Asignatura asignatura) {
        if(asignatura == null) return null;

        AsignaturaDTO asignaturaDTO = new AsignaturaDTO();
        asignaturaDTO.setNombreAsignatura(asignaturaDTO.getNombreAsignatura());
        asignaturaDTO.setCreditos(asignaturaDTO.getCreditos());

        return asignaturaDTO;

    }


    public Asignatura toXml(AsignaturaDTO asignaturaDTO) {
        if(asignaturaDTO == null) return null;

        Asignatura asignaturaXML = new Asignatura();
        asignaturaXML.setNombreAsignatura(asignaturaDTO.getNombreAsignatura());
        asignaturaXML.setCreditos(asignaturaDTO.getCreditos());
        return asignaturaXML;


    }
}
