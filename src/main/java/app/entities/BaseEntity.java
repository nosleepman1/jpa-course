package app.entities;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.UUID)   
    @Column(unique = true, nullable = false, updatable = false) 
    protected UUID id;

    @Column(updatable = false, nullable = false)
    protected Date createdAt;    

    protected BaseEntity() {
    }

    public UUID getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
