package com.inicio.springwebservicesprueba.repository;

import com.inicio.springwebservicesprueba.dto.AsignaturaDTO;
import com.inicio.springwebservicesprueba.dto.EstudianteDTO;
import com.inicio.springwebservicesprueba.mapper.AsignaturaRowpperDB;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AsignaturaDAO {


    private final JdbcTemplate jdbcTemplate;

    private final AsignaturaRowpperDB asignaturaRowpperDB = new AsignaturaRowpperDB();

    public AsignaturaDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }



    public AsignaturaDTO obtenerAsignaturaPorId(int idAsignatura) {
        String sql = "SELECT * FROM asignaturas WHERE id_asignatura = ?";

        return jdbcTemplate.queryForObject(sql,asignaturaRowpperDB, idAsignatura);
    }


//    public List<EstudianteDTO> obtenerEstudiantesPorAsignatura(int idAsignatura) {
//        String sql = """
//        SELECT e.id_estudiante, e.nombre, e.apellido, e.correo, e.edad, e.fk_pais
//        FROM estudiantes e
//        JOIN estudiante_asignatura ea ON e.id_estudiante = ea.id_estudiante
//        WHERE ea.id_asignatura = ?
//    """;
//
//        return jdbcTemplate.query(sql, estudianteRowmapperDB, idAsignatura);
//    }
}
