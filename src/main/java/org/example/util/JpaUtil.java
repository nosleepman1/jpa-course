package org.example.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {

    private static final EntityManagerFactory EMF =
            Persistence.createEntityManagerFactory("jap_db");


    private JpaUtil() {}

    public static EntityManagerFactory  getEntityManager() {
        return EMF;
    }

    public static void close() {
        if(EMF.isOpen()) EMF.close();
    }
}
