package com.inicio.springwebservicesprueba.repository;

import com.ejemplo.school.Asignatura;
import com.inicio.springwebservicesprueba.dto.EstudianteDTO;
import com.inicio.springwebservicesprueba.mapper.EstudianteRowmapperDB;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EstudianteDAO {

    private final EstudianteRowmapperDB estudianteRowmapperDB = new EstudianteRowmapperDB();

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
                EstudianteDTO estudiante = new EstudianteDTO();
                estudiante.setIdStudiante(rs.getInt("id_estudiante"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setEdad(rs.getInt("edad"));
                estudiante.setCorreo(rs.getString("correo"));
                estudiante.setFkPais(rs.getInt("fk_pais"));
                return estudiante;
            }, idEstudiante);



            return null;

        } catch (EmptyResultDataAccessException e) {

            return null;
        }
    }

//    public List<Asignatura> obtenerAsignaturasDeEstudiante(int estudianteId) {
//        String sql = """
//            SELECT a.id, a.nombre_asignatura, a.creditos
//            FROM asignatura a
//            INNER JOIN estudiante_asignatura ea ON a.id = ea.asignatura_id
//            WHERE ea.estudiante_id = ?
//        """;
//
//        return jdbcTemplate.query(sql, new Object[]{estudianteId}, (rs, rowNum) -> {
//            Asignatura asignatura = new Asignatura();
//            asignatura.setId(rs.getInt("id"));
//            asignatura.setNombreAsignatura(rs.getString("nombre_asignatura"));
//            asignatura.setCreditos(rs.getInt("creditos"));
//            return asignatura;
//        });
//    }


}
