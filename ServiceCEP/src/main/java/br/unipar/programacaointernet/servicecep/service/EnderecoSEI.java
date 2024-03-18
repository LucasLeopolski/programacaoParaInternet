package br.unipar.programacaointernet.servicecep.service;

import br.unipar.programacaointernet.servicecep.model.Endereco;
import br.unipar.programacaointernet.servicecep.model.Usuario;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface EnderecoSEI {

    @WebMethod
    String boasVindas(@WebParam(name = "nome") String nome);

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;

    @WebMethod
     String salvarEndereco(@WebParam(name = "cep")String cep,
                           @WebMethod(name = "logradouro")String logradouro),



    @WebMethod
    Strng deletarEndereco(@WebParam(name))


        @WebMethod
    Endereco consultaEndereco



}
