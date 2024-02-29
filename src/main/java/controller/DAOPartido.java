package controller;

import database.HibernateUtil;
import model.Equipo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DAOPartido {
    private SessionFactory sessionFactory;

    public DAOPartido() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insertarPartido(Equipo equipo) {
        //ssesion
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        //persist, list, update, delete, HQL
        session.persist(equipo);
        //commit
        session.beginTransaction().commit();
        //close
        session.close();
    }
}