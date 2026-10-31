package app.repositories;
import java.util.Optional;

import app.utils.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;


public abstract class BaseRepository<T, C> {

    private final EntityManager EM = JpaUtil.getEntityManager();
    private final EntityTransaction tx = EM.getTransaction();
    protected final Class<T> entity;


    protected BaseRepository(Class<T> entity) {
        this.entity = entity;
    }

    
    public Optional<T> findById(C id) throws Exception{
        try {

            T response =   EM.find(this.entity, id);
            
            return Optional.ofNullable(response);


        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }   
    public  abstract void delete(T entity); 
    public abstract Optional<T> save(T entity);
    public abstract Optional<T> update(T entity);   
}
