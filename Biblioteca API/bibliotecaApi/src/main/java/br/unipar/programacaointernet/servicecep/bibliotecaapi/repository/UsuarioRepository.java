package br.unipar.programacaointernet.servicecep.bibliotecaapi.repository;

import br.unipar.programacaointernet.servicecep.bibliotecaapi.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class UsuarioRepository {

    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<Usuario> listar(){
        String jpql = "SELECT l FROM Usuario l";
        return em.createQuery(jpql, Usuario.class).getResultList();

    }

    public void cadastrar(Usuario usuario) throws Exception{
        try {
            em.persist(usuario);
        }catch (Exception ex){
            throw new Exception("Usuario não pode ser cadastrado");
        }
    }
}
