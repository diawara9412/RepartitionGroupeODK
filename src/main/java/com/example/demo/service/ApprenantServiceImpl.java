package com.example.demo.service;

import com.example.demo.entity.Apprenant;
import com.example.demo.repository.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApprenantServiceImpl implements ApprenantService{

    @Autowired
    ApprenantRepository apprenantRepository;
    public Apprenant saveApprenant(Apprenant apprenant) {
        return apprenantRepository.save(apprenant) ;
    }

    @Override
    public List<Apprenant> listApprenant(Apprenant apprenant) {
        return apprenantRepository.findAll();
    }

    @Override
    public Apprenant apprenantById(Long id) {
        return apprenantRepository.findById(id).get();
    }

    @Override
    public Apprenant updateApprenant(Apprenant apprenant, Long id) {
        Apprenant apprenant1 = apprenantRepository.findById(id).get();
        apprenant1.setNom(apprenant.getNom());
        apprenant1.setEmail(apprenant.getEmail());
        apprenant1.setPrenom(apprenant.getPrenom());
        apprenant1.setTelephone(apprenant.getTelephone());
        apprenant1.setIdApprenant((apprenant.getIdApprenant()));

        return  apprenantRepository.save(apprenant1);
    }

    @Override
    public String deleteApprenant(Long id) {
        apprenantRepository.deleteById(id);
        return "Apprenant Supprimer avec succès";
    }
}
