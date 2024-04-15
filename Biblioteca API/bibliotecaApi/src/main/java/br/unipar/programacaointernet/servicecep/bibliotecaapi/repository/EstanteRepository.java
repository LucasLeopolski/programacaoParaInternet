package br.unipar.programacaointernet.servicecep.bibliotecaapi.repository;

import br.unipar.programacaointernet.servicecep.bibliotecaapi.model.Estante;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class EstanteRepository {

    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<Estante> listar(){

        String jpql = "SELECT l FROM Estante l";
        return em.createQuery(jpql, Estante.class).getResultList();

    }

    public void cadastrar(Estante estante) throws  Exception{
        try {
            em.persist(estante);
        }catch (Exception ex){
            throw new Exception("Estante não pode ser cadatrada");
        }
    }
}

