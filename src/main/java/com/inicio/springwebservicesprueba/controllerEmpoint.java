package com.inicio.springwebservicesprueba;

import com.ejemplo.school.*;

import com.inicio.springwebservicesprueba.dto.AsignaturaDTO;
import com.inicio.springwebservicesprueba.dto.EstudianteDTO;
import com.inicio.springwebservicesprueba.mapper.AsignaturaMapper;
import com.inicio.springwebservicesprueba.mapper.EstudianteMapper;
import com.inicio.springwebservicesprueba.service.EstudianteService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;
import java.util.stream.Collectors;

@Endpoint
public class controllerEmpoint {


    private final AsignaturaMapper asignaturaMapper ;

    private final EstudianteMapper estudianteMapper;

    private final EstudianteService estudianteService;

    private static final String NAMESPACE_URI = "http://ejemplo.com/school";

    public controllerEmpoint(AsignaturaMapper asignaturaMapper, EstudianteMapper estudianteMapper, EstudianteService estudianteService) {
        this.asignaturaMapper = asignaturaMapper;
        this.estudianteMapper = estudianteMapper;
        this.estudianteService = estudianteService;
    }




    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GuardarEstudianteRequest")
    @ResponsePayload
    public GuardarEstudianteResponse guardarEstudiantes(@RequestPayload GuardarEstudianteRequest request) {
        GuardarEstudianteResponse response = new GuardarEstudianteResponse();
        response.setMensaje("seguardo el usuario con exito");
        estudianteService.agregarEstudiante(estudianteMapper.toDTO(request.getEstudiante()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EliminarEstudianteRequest")
    @ResponsePayload
    public EliminarEstudianteResponse eliminar(@RequestPayload EliminarEstudianteRequest request) {

        EliminarEstudianteResponse response = new EliminarEstudianteResponse();

        response.setMensaje("eliminado el usuario con exito");
        estudianteService.eliminarStudiante(request.getIdEstudiante());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ObtenerEstudiantesRequest")
    @ResponsePayload
    public ListaEstudiantes obtenerEstudiantesRequest(@RequestPayload ObtenerEstudiantesRequest request) {

        ListaEstudiantes listaEstudiantes = new ListaEstudiantes();

        List<EstudianteDTO> list = estudianteService.obtenerEstudiantes();
        for(EstudianteDTO estudianteDTO : list){
            Estudiante estudianteXml = estudianteMapper.toXml(estudianteDTO);
            listaEstudiantes.getEstudiante().add(estudianteXml);

        }
        return listaEstudiantes;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ModificarEstudianteRequest")
    @ResponsePayload
    public ModificarEstudianteRequest modificarEstudiante(@RequestPayload ModificarEstudianteRequest request) {

       estudianteService.modificarEstudiante(estudianteMapper.toDTO(request.getEstudiante()), request.getIdEstudiante());

        return null;

    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ModificarEstudianteRequest")
    @ResponsePayload
    public ModificarEstudianteRequest obtenerAsignaturasEstudiantes(@RequestPayload ModificarEstudianteRequest request) {

        estudianteService.modificarEstudiante(estudianteMapper.toDTO(request.getEstudiante()), request.getIdEstudiante());

        return null;

    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "obtenerAsignaturasPorEstudianteRequest")
    @ResponsePayload
    public ObtenerAsignaturasPorEstudianteResponse obtenerAsignaturasPorEstudiante(
            @RequestPayload ObtenerAsignaturasPorEstudianteRequest request) {


        EstudianteDTO estudiante = estudianteService.obtenerEstudiantePorId(request.getIdEstudiante());
        List<AsignaturaDTO> asignaturas = estudianteService.obtenerAsignaturasPorEstudiante(request.getIdEstudiante());

        ObtenerAsignaturasPorEstudianteResponse response = new ObtenerAsignaturasPorEstudianteResponse();
        response.setEstudiante(estudianteMapper.toXml(estudiante));
        response.getAsignatura().addAll(
                asignaturas.stream()
                        .map(asignaturaMapper::toXml)
                        .collect(Collectors.toList())
        );

        return response;
    }




}
