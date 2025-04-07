package com.inicio.springwebservicesprueba.repository;

import com.ejemplo.school.Asignatura;
import com.inicio.springwebservicesprueba.dto.AsignaturaDTO;
import com.inicio.springwebservicesprueba.dto.EstudianteDTO;
import com.inicio.springwebservicesprueba.mapper.AsignaturaRowpperDB;
import com.inicio.springwebservicesprueba.mapper.EstudianteRowmapperDB;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EstudianteDAO {

    private final EstudianteRowmapperDB estudianteRowmapperDB = new EstudianteRowmapperDB();
    private final AsignaturaRowpperDB asignaturaRowpperDB = new AsignaturaRowpperDB();

    private final JdbcTemplate jdbcTemplate;

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public EstudianteDAO(JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public void save(EstudianteDTO estudiante) {
        String sql = "INSERT INTO estudiantes (nombre, apellido,correo,edad,fk_pais) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                estudiante.getNombre(),
                estudiante.getApellido(),
                estudiante.getCorreo(),
                estudiante.getEdad(),
                estudiante.getFkPais());
    }


    public void delete(int idestudiante) {
        String sql = "DELETE FROM estudiantes WHERE id_estudiante = ?";
        jdbcTemplate.update(sql,idestudiante);
    }


    public List<EstudianteDTO> getEstudiante() {
        String sql = "SELECT * FROM estudiantes ";
            return jdbcTemplate.query(sql, estudianteRowmapperDB);
    }


    public EstudianteDTO modificarEstudiante(EstudianteDTO estudianteDTO, int idEstudiante) {
        // Verificar si el estudiante existe antes de actualizar
        String sqlBuscar = "SELECT * FROM estudiantes WHERE id_estudiante = ?";
                
        try {
            EstudianteDTO estudianteExistente = jdbcTemplate.queryForObject(sqlBuscar, (rs, rowNum) -> {

                return estudianteRowmapperDB.mapRow(rs, rowNum);
            }, idEstudiante);

            return null;

        } catch (EmptyResultDataAccessException e) {

            return null;
        }
    }

    public EstudianteDTO obtenerEstudiantePorId(int idEstudiante) {
        String sql = "SELECT * FROM estudiantes WHERE id_estudiante = ?";
        return jdbcTemplate.queryForObject(sql, estudianteRowmapperDB, idEstudiante);
    }

    public List<AsignaturaDTO> obtenerAsignaturasPorEstudiante(int idEstudiante) {
        String sql = "SELECT a.id_asignatura, a.nombre_asignatura, a.creditos " +
                "FROM asignaturas a " +
                "JOIN estudiante_asignatura ea ON a.id_asignatura = ea.id_asignatura " +
                "WHERE ea.id_estudiante = ?";
        return jdbcTemplate.query(sql,asignaturaRowpperDB, idEstudiante);
    }
}








