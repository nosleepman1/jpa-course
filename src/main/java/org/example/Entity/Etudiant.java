package org.example.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "etudiants")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, length = 100)
    private String nom;

    @Column(nullable = false)
    private int age;


    public Etudiant() {}

}
