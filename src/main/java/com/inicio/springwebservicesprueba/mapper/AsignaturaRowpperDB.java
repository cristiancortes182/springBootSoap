package com.inicio.springwebservicesprueba.mapper;

import com.inicio.springwebservicesprueba.dto.AsignaturaDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AsignaturaRowpperDB implements RowMapper<AsignaturaDTO> {

    @Override
    public AsignaturaDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        AsignaturaDTO asignaturaDTO = new AsignaturaDTO();
        asignaturaDTO.setIdAsignatura(rs.getInt("id_asignatura"));
        asignaturaDTO.setNombreAsignatura(rs.getString("nombre_asignatura"));
        asignaturaDTO.setCreditos(rs.getInt("creditos"));
        return asignaturaDTO;
    }




}
