package com.example.demo.service;

import com.example.demo.entity.Apprenant;

import java.util.List;

public interface ApprenantService {
    Apprenant saveApprenant(Apprenant apprenant);
    List<Apprenant> listApprenant(Apprenant apprenant);
    Apprenant apprenantById(Long id);
    Apprenant updateApprenant(Apprenant apprenant,Long id);
    String deleteApprenant(Long id);

}
