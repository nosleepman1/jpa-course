
package sn.isi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.example.Entity.Etudiant;
import org.example.util.JpaUtil;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                JpaUtil.getEntityManager();

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Etudiant etudiant = new Etudiant("Abdallah", 24);


            em.persist(etudiant);

            tx.commit();

            System.out.println("Etudiant créé : " + etudiant);

        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            JpaUtil.close();
        }
    }
}
