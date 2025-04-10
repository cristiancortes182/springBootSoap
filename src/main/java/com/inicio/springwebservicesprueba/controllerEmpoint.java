package com.inicio.springwebservicesprueba;

import com.ejemplo.school.*;

import com.inicio.springwebservicesprueba.dto.AsignaturaDTO;
import com.inicio.springwebservicesprueba.dto.EstudianteDTO;
import com.inicio.springwebservicesprueba.dto.PaisDTO;
import com.inicio.springwebservicesprueba.mapper.AsignaturaMapper;
import com.inicio.springwebservicesprueba.mapper.EstudianteMapper;
import com.inicio.springwebservicesprueba.service.AsignaturaService;
import com.inicio.springwebservicesprueba.service.EstudianteService;
import com.inicio.springwebservicesprueba.service.PaisService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.addAll;

@Endpoint
public class controllerEmpoint {


    private final AsignaturaMapper asignaturaMapper ;

    private final PaisService paisService ;

    private final EstudianteMapper estudianteMapper;

    private final EstudianteService estudianteService;

    private final AsignaturaService  asignaturaService;

    private static final String NAMESPACE_URI = "http://ejemplo.com/school";

    public controllerEmpoint(AsignaturaMapper asignaturaMapper, PaisService paisService, EstudianteMapper estudianteMapper, EstudianteService estudianteService, AsignaturaService asignaturaService) {
        this.asignaturaMapper = asignaturaMapper;
        this.paisService = paisService;
        this.estudianteMapper = estudianteMapper;
        this.estudianteService = estudianteService;
        this.asignaturaService = asignaturaService;
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
    public ObtenerEstudiantesResponse obtenerEstudiantesRequest(@RequestPayload ObtenerEstudiantesRequest request) {


        List<EstudianteDTO> listaDTO = estudianteService.obtenerEstudiantes();


        List<Estudiante> listaXml = listaDTO.stream()
                .map(estudianteMapper::toXml)
                .collect(Collectors.toList());




        ListaEstudiantes listaEstudiantes = new ListaEstudiantes();
        listaEstudiantes.getEstudiante().addAll(listaXml);


        ObtenerEstudiantesResponse response = new ObtenerEstudiantesResponse();
        response.setListaEstudiantes(listaEstudiantes);

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ModificarEstudianteRequest")
    @ResponsePayload
    public ModificarEstudianteRequest modificarEstudiante(@RequestPayload ModificarEstudianteRequest request) {

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


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "obtenerEstudiantesPorAsignaturaRequest")
    @ResponsePayload
    public ObtenerEstudiantesPorAsignaturaResponse obtenerEstudiantesPorAsignatura(
            @RequestPayload ObtenerEstudiantesPorAsignaturaRequest request) {

        List<EstudianteDTO> estudiantesDTO = estudianteService.obtenerEstudiantesPorAsignatura(request.getIdAsignatura());

        AsignaturaDTO asignatura = asignaturaService.obtenerEstudiantePorId(request.getIdAsignatura());

        Asignatura asignaturaXml = asignaturaMapper.toXml(asignatura);
        List<Estudiante> estudiantesXml = estudiantesDTO.stream()
                .map(estudianteMapper::toXml)
                .collect(Collectors.toList());

        ObtenerEstudiantesPorAsignaturaResponse response = new ObtenerEstudiantesPorAsignaturaResponse();
        response.setAsignatura(asignaturaXml);
        response.getEstudiante().addAll(estudiantesXml);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ObtenerPaisesRequest")
    @ResponsePayload
    public ObtenerPaisesResponse obtenerPaises(@RequestPayload ObtenerPaisesRequest request){


        List<PaisDTO> paisesBD = paisService.obtenerPaises();

        ObtenerPaisesResponse response = new ObtenerPaisesResponse();

        for (PaisDTO entity : paisesBD) {
            Pais paisXML = new Pais();
            paisXML.setIdPais(entity.getIdPais());
            paisXML.setNombrePais(entity.getNombrePais());
            paisXML.setCodigo(entity.getCodigo());

            response.getPaises().add(paisXML);
            System.out.println(response.getPaises().add(paisXML));
        }



        return response;





    }



}
