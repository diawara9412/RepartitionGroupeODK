package com.example.demo.service;

import com.example.demo.entity.Repartion;
import com.example.demo.repository.RepartitionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RepartitionServiceImpl implements  RepartitionService{
    @Autowired
    RepartitionRepository repartitionRepository;
    @Override
    public Repartion ajouterRepartition(Repartion repartion) {
        return repartitionRepository.save(repartion);
    }

    @Override
    public List<Repartion> listGroupe(Repartion repartion) {
        return repartitionRepository.findAll();
    }

    @Override
    public String supprimerRepartition(Long id) {
        repartitionRepository.deleteById(id);
        return "Supprimer avec succès";
    }

    @Override
    public Repartion modifierRepartition(Repartion repartion, Long id) {
        Repartion repartion1 = repartitionRepository.findById(id).get();
        repartion1.setNom(repartion.getNom());
        return repartitionRepository.save(repartion1);
    }

    @Override
    public Repartion repartitionParId(Long id) {
        return repartitionRepository.findById(id).get();
    }
}
