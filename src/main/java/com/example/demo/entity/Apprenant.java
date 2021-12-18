package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Apprenant implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idApprenant;
    private  String nom;
    private  String prenom;
    @Column(nullable = false, unique = true)
    private  String Email;
    @Column(nullable = false, unique = true)
    private  String telephone;
    @ManyToMany
    @JoinTable(name = "Groupe")
    @JoinColumn(name = "date")
    @JoinColumn(name = "tache")
    private List<Repartion> repartion;
    @ManyToOne
    private Promotion promotion;

    public Apprenant() {
    }

    public Long getIdApprenant() {
        return idApprenant;
    }

    public void setIdApprenant(Long idApprenant) {
        this.idApprenant = idApprenant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
