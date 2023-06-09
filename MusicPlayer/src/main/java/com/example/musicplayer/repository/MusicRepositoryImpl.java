package com.example.musicplayer.repository;

import com.example.musicplayer.model.Music;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


public class MusicRepositoryImpl implements MusicRepository{
    @PersistenceContext
    private EntityManager entityManager;

    public MusicRepositoryImpl() {
    }

    @Override
    public Music findById(int id) {
        TypedQuery<Music> query = entityManager.createNamedQuery("FIND_BY_ID", Music.class).setParameter("id",id);
        return query.getSingleResult();
    }

    @Override
    public List<Music> findAll() {
        TypedQuery<Music> query = entityManager.createQuery("select m from Music m",Music.class);
        return query.getResultList();
    }

    @Override
    public void save(Music name) {
        entityManager.persist(name);
    }
}
