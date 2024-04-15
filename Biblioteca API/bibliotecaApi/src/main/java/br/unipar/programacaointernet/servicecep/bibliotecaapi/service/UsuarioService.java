package br.unipar.programacaointernet.servicecep.bibliotecaapi.service;

import br.unipar.programacaointernet.servicecep.bibliotecaapi.model.Usuario;
import br.unipar.programacaointernet.servicecep.bibliotecaapi.repository.UsuarioRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class UsuarioService {

    @Inject
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarUsuarios(){return usuarioRepository.listar();}

    public void cadastrar (Usuario usuario) throws Exception {
        usuarioRepository.cadastrar(usuario);

    }
}
