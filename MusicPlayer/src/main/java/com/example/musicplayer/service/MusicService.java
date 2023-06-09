package com.example.musicplayer.service;

import com.example.musicplayer.model.Music;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class MusicService {
//    private static SessionFactory sessionFactory;
//    private static EntityManager entityManager;
//
//    static {
//        try {
//            sessionFactory = new Configuration()
//                    .configure("hibernate.conf.xml")
//                    .buildSessionFactory();
//            entityManager = sessionFactory.createEntityManager();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        }
//    }
//    public List<Music> findAll() {
//        String queryStr = "SELECT m from Music as m";
//        TypedQuery<Music> query = entityManager.createQuery(queryStr, Music.class);
//        return query.getResultList();
//    }
}
