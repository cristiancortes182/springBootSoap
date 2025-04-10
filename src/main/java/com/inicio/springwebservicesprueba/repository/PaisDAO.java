package com.inicio.springwebservicesprueba.repository;

import com.inicio.springwebservicesprueba.dto.PaisDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaisDAO {

    private final JdbcTemplate jdbcTemplate;

    public PaisDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<PaisDTO> obtenerPais() {

        String sql = "SELECT * FROM paises";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            PaisDTO pais = new PaisDTO();
            pais.setIdPais(rs.getInt("id_pais"));
            pais.setNombrePais(rs.getString("nombre_pais"));
            pais.setCodigo(rs.getString("codigo"));
            return pais;
        });

    }
}
