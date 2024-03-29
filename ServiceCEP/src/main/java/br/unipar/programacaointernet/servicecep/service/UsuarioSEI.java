package br.unipar.programacaointernet.servicecep.service;

import br.unipar.programacaointernet.servicecep.model.Usuario;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface UsuarioSEI {

    @WebMethod
    String boasVindas(@WebParam(name = "nome") String nome);

    Usuario consultaUsuarios(@WebParam(name = "idUsuario") Long id);
}
