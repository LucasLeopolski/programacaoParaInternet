package br.unipar.programacaointernet.servicecep.bibliotecaapi.controller;

import br.unipar.programacaointernet.servicecep.bibliotecaapi.model.Estante;
import br.unipar.programacaointernet.servicecep.bibliotecaapi.service.EstanteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/estante")
public class EstanteController {

    @Inject
    private EstanteService estanteService;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response listarEstantes(){
        return Response.ok(estanteService.listar()).build();
    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)

    public Response cadastrarEstante(Estante estante){

        try {
            estanteService.cadastrar(estante);
            return Response.status(201).entity("Estante cadastrada com sucesso!").build();
        }catch (Exception ex){
            return Response.status(403).entity(ex.getMessage()).build();
        }
    }
}
