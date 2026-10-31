package app.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    

    public static EntityManagerFactory EM = Persistence.createEntityManagerFactory("mysql-jpa");


    public static EntityManager getEntityManager() {
        return EM.createEntityManager();
    }

    public static void close(){
        if(EM.isOpen()) EM.close();
    }
}
