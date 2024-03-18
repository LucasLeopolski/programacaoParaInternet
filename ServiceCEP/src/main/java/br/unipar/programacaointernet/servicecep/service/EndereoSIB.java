package br.unipar.programacaointernet.servicecep.service;

import br.unipar.programacaointernet.servicecep.dao.EnderecoDAOImpl;
import br.unipar.programacaointernet.servicecep.model.Endereco;

public interface EndereoSIB {

    public class EnderecoSIB implements EnderecoSEI {
        @Override
        public String boasVindas(String nome) {
            return "Bem Vindo(a) " + nome + "!";
        }

        @Override
        public Endereco consultaUsuario(Long idUsuario) {
            EnderecoDAO usuarioDAO = new EnderecoDAOImpl((EntityManagerUtil
                    .getManager());

            Endereco usuario = enderecoDAO.findById(idEndereco);

            return endereco;
        }
}
