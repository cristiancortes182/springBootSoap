package com.inicio.springwebservicesprueba.service;

import com.inicio.springwebservicesprueba.repository.EstudianteDAO;
import com.inicio.springwebservicesprueba.dto.EstudianteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private final EstudianteDAO estudianteDAO;

    public EstudianteService(EstudianteDAO estudianteDAO) {
        this.estudianteDAO = estudianteDAO;
    }

    public void agregarEstudiante(EstudianteDTO estudiante) {
        estudiante.setCorreo(estudiante.getNombre() + estudiante.getApellido() + "@fasttrack.com");
       estudianteDAO.save(estudiante);
    }

    public void eliminarStudiante(int idstudiante) {
        estudianteDAO.delete(idstudiante);
    }

    public List<EstudianteDTO> obtenerEstudiantes() {
        return estudianteDAO.getEstudiante();
    }

    public void modificarEstudiante(EstudianteDTO estudianteDTO , int idestudiante) {

        estudianteDTO.setCorreo(estudianteDTO.getNombre() + estudianteDTO.getApellido() + "@fasttrack.com");
        estudianteDAO.modificarEstudiante(estudianteDTO, idestudiante);


    }
}