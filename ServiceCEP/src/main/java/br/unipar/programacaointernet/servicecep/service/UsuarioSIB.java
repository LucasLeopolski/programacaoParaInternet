package br.unipar.programacaointernet.servicecep.service;

import br.unipar.programacaointernet.servicecep.dao.UsuarioDAO;
import br.unipar.programacaointernet.servicecep.dao.UsuarioDAOImpl;
import br.unipar.programacaointernet.servicecep.model.Usuario;
import br.unipar.programacaointernet.servicecep.util.EntityManagerUtil;
import jakarta.jws.WebService;

import javax.swing.text.html.parser.Entity;

@WebService(endpointInterface = "br.unipar.programacaointernet.servicecep.service.UsuarioSEI")
public class UsuarioSIB implements UsuarioSEI{
    @Override
    public String boasVindas(String nome) {
        return "Bem Vindo " + nome + "!";

    }

    @Override
    public String salvarUsuario(String nome, String login, String senha){
        UsuarioDAO usuarioDAO = new UsuarioDAOImpl(EntityManagerUtil.getManager());

        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setLogin(login);
        usuario.setSenha(senha);

        usuarioDAO.save(usuario);

    }

    @Override
    public void editarUsuario(Long id,
                              String nome,
                              String login,
                              String senha) {

        UsuarioDAO usuarioDAO = new UsuarioDAOImpl(EntityManagerUtil.getManager());

        Usuario usuario = usuarioDAO.findById(id);

        if (nome != null)
            usuario.setNome(nome);

        if (login != null)
            usuario.setLogin(login);

        if (senha != null)
            usuario.setSenha(senha);

        usuarioDAO.update(usuario);

        return "Usuário " + usuario.getNome() + " editado com sucesso!";

    }

    @Override
    public void deletarUsuario(Long id){

        UsuarioDAO usuarioDAO = new UsuarioDAOImpl(EntityManagerUtil.getManager());

        Usuario usuario = usuarioDAO.findById(id);
        usuarioDAO.delete(usuario);

        return "Usuário " + usuario.getNome() + " removido com sucesso!";
    }


    @Override
    public Usuario consultaUsuarioPorId(Long id){

        UsuarioDAO
    }



    @Override
    public Usuario consultaUsuarios(Long idUsuario) {
        UsuarioDAO usdao = new UsuarioDAOImpl(EntityManagerUtil.getManager());
        Usuario user = usdao.findById(idUsuario);
        return user;
    }

}
