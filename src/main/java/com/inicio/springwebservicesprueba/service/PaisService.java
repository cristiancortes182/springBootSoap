package com.inicio.springwebservicesprueba.service;

import com.inicio.springwebservicesprueba.dto.EstudianteDTO;
import com.inicio.springwebservicesprueba.dto.PaisDTO;
import com.inicio.springwebservicesprueba.repository.EstudianteDAO;
import com.inicio.springwebservicesprueba.repository.PaisDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {


   private final  PaisDAO paisDAO;

    public PaisService(PaisDAO paisDAO) {
        this.paisDAO = paisDAO;
    }

    public List<PaisDTO> obtenerPaises() {

        return paisDAO.obtenerPais();
    }

}
