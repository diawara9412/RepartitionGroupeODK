package com.example.demo.service;

import com.example.demo.entity.Repartion;

import java.util.List;

public interface RepartitionService {
 Repartion ajouterRepartition( Repartion repartion);
 List <Repartion> listGroupe(Repartion repartion);
 String supprimerRepartition(Long id);
 Repartion modifierRepartition(Repartion repartion, Long id);
 Repartion repartitionParId(Long id);
}
