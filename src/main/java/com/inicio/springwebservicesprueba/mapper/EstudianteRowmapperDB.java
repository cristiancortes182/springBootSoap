package com.inicio.springwebservicesprueba.mapper;

import com.inicio.springwebservicesprueba.dto.EstudianteDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EstudianteRowmapperDB implements RowMapper<EstudianteDTO> {
    @Override
    public EstudianteDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        EstudianteDTO estudianteDTO = new EstudianteDTO();
        estudianteDTO.setIdStudiante(rs.getInt("id_estudiante"));
        estudianteDTO.setNombre(rs.getString("nombre"));
        estudianteDTO.setEdad(rs.getInt("edad"));
        estudianteDTO.setCorreo(rs.getString("correo"));
        estudianteDTO.setApellido(rs.getString("apellido"));
        estudianteDTO.setFkPais(rs.getInt("fk_pais"));
        return estudianteDTO;
    }
}
