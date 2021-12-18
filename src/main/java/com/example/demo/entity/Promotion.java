package com.example.demo.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Promotion  implements Serializable {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Date date;
    @OneToMany(mappedBy = "promotion")
    private List<Apprenant> apprenant;
    @OneToMany(mappedBy = "promotion")
    private List<Repartion> repartion;

    public Promotion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Apprenant> getApprenant() {
        return apprenant;
    }

    public void setApprenant(List<Apprenant> apprenant) {
        this.apprenant = apprenant;
    }

    public List<Repartion> getRepartion() {
        return repartion;
    }

    public void setRepartion(List<Repartion> repartion) {
        this.repartion = repartion;
    }
}
