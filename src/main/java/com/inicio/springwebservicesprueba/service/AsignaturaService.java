package com.inicio.springwebservicesprueba.service;

import com.inicio.springwebservicesprueba.dto.AsignaturaDTO;
import com.inicio.springwebservicesprueba.dto.EstudianteDTO;
import com.inicio.springwebservicesprueba.mapper.AsignaturaRowpperDB;
import com.inicio.springwebservicesprueba.mapper.EstudianteRowmapperDB;
import com.inicio.springwebservicesprueba.repository.AsignaturaDAO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AsignaturaService {

    private final EstudianteRowmapperDB estudianteRowmapperDB = new EstudianteRowmapperDB();
    private final AsignaturaRowpperDB asignaturaRowpperDB = new AsignaturaRowpperDB();

    private final AsignaturaDAO asignaturaDAO;

    private final JdbcTemplate jdbcTemplate;

    public AsignaturaService(AsignaturaDAO asignaturaDAO, JdbcTemplate jdbcTemplate) {
        this.asignaturaDAO = asignaturaDAO;
        this.jdbcTemplate = jdbcTemplate;
    }

//    public List<EstudianteDTO> obtenerEstudiantesPorAsignatura(int idAsignatura) {
//        return AsignaturaDAO.obtenerEstudiantesPorAsignatura(idAsignatura);
//    }


    public AsignaturaDTO obtenerEstudiantePorId(int idEstudiante) {
        return asignaturaDAO.obtenerAsignaturaPorId(idEstudiante);
    }
}
