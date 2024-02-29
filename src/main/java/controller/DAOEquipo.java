package controller;

import database.HibernateUtil;
import model.Equipo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DAOEquipo {
    private SessionFactory sessionFactory;

    public DAOEquipo() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insertarEquipo(Equipo equipo) {
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

    public void borrarEquipo(int idEquipo) {
        // Obtener la sesión
        Session session = sessionFactory.openSession();

        // Iniciar la transacción
        session.beginTransaction();

        try {
            // Obtener el equipo por su ID
            Equipo equipo = session.get(Equipo.class, idEquipo);

            // Verificar si el equipo existe
            if (equipo != null) {
                // Borrar el equipo
                session.delete(equipo);
                System.out.println("Equipo borrado exitosamente.");
            } else {
                System.out.println("No se encontró un equipo con el ID proporcionado.");
            }

            // Confirmar la transacción
            session.getTransaction().commit();
        } finally {
            // Cerrar la sesión
            session.close();
        }
    }
}