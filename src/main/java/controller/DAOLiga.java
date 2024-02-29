package controller;

import database.HibernateUtil;
import model.Liga;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DAOLiga {
    //opercaciones sobre la BD y el modelo que la representn.
    private SessionFactory sessionFactory;

    public DAOLiga(){
        sessionFactory = HibernateUtil.getSessionFactory();
    }
    public void insertarLiga(Liga liga){
        //ssesion
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        //persist, list, update, delete, HQL
        session.persist(liga);
        //commit
        session.beginTransaction().commit();
        //close
        session.close();
    }
    public void borrarLiga(int idLiga){
        //ssesion
        //persist, list, update, delete, HQL
        //commit
        //close
    }
}