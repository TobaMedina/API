package com.example.demo.DAO;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.modelos.EspacioComun;

@Repository
public class EspacioComunImpl implements IEspacioComunDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<EspacioComun> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<EspacioComun> getQuery = currentSession.createQuery("from espacios_comunes", EspacioComun.class);
        List<EspacioComun> espaciosComunes = getQuery.getResultList();

        return espaciosComunes;
    }

    @Override
    @Transactional(readOnly = true)
    public EspacioComun findById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        EspacioComun espacioComun = currentSession.get(EspacioComun.class, id);

        return espacioComun;
    }

    @Override
    @Transactional
    public void save(EspacioComun espacioComun) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.persist(espacioComun);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery("delete from espacios_comunes where id=:idEspacioComun");
        theQuery.setParameter("idEspacioComun", id);
        theQuery.executeUpdate();
    }
}
