package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Repartion  implements Serializable {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  long idRepartition;
    private  String nom;
    private TypeRepartition typeRepartition;
    private NombreRepartition nombreRepartition;
    @ManyToMany(mappedBy = "repartion")
    private  List<Apprenant> apprenant;
    @ManyToOne
    private Promotion promotion;

    public Repartion() {
    }

    public long getIdRepartition() {
        return idRepartition;
    }

    public void setIdRepartition(long idRepartition) {
        this.idRepartition = idRepartition;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Apprenant> getApprenant() {
        return apprenant;
    }

    public void setApprenant(List<Apprenant> apprenant) {
        this.apprenant = apprenant;
    }
}
