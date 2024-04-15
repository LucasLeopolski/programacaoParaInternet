package br.unipar.programacaointernet.servicecep.bibliotecaapi.controller;

import br.unipar.programacaointernet.servicecep.bibliotecaapi.model.Livro;
import br.unipar.programacaointernet.servicecep.bibliotecaapi.service.LivroService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/livro")
public class LivroController {

    @Inject // serve para instanciar o objeto

    private LivroService livroService;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response listarLivros() {
        return Response.ok(livroService.listar()).build();

    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)

    public Response cadastrarLivro(Livro livro) {
        try {
            livroService.cadastrar(livro);
            return Response.status(201).entity("Livro cadastrado com suceso").build();

        } catch (Exception ex) {
            return Response.status(403).entity(ex.getMessage()).build();
        }
    }
}