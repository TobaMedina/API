package com.example.demo.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.modelos.ReclamoModel;

@Repository
public class ReclamoModelImpl implements IReclamoDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<ReclamoModel> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<ReclamoModel> getQuery = currentSession.createQuery("from reclamos", ReclamoModel.class);
        List<ReclamoModel> reclamos = getQuery.getResultList();

        return reclamos;
    }

    @Override
    @Transactional(readOnly = true)
    public ReclamoModel findById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        ReclamoModel reclamo = currentSession.get(ReclamoModel.class, id);

        return reclamo;
    }

    @Override
    @Transactional
    public void save(ReclamoModel reclamo) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.persist(reclamo);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery("delete from reclamos where id=:idReclamo");
        theQuery.setParameter("idReclamo", id);
        theQuery.executeUpdate();
    }
}

