package com.example.demo.controller;

import com.example.demo.entity.Apprenant;
import com.example.demo.service.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/")
public class ApprenantController {
    @Autowired
    ApprenantService apprenantService;
    @GetMapping("listApprenant")
    public List<Apprenant> listApprenant(Apprenant apprenant){
        return apprenantService.listApprenant(apprenant);
    }
    @PostMapping("AjoutApprenant")
    public Apprenant ajouterApprenant(@RequestBody Apprenant apprenant){
        return apprenantService.saveApprenant(apprenant);
    }
    @GetMapping("ApprenantById/{id}")
    public Apprenant apprenantById(@PathVariable("id") Long id){
        return apprenantService.apprenantById(id);
    }
    @PutMapping("ModifierApprenant/{id}")
    public Apprenant modifierApprenant(@RequestBody Apprenant apprenant, @PathVariable("id") Long id){
        return apprenantService.updateApprenant(apprenant,id);
    }
    @DeleteMapping("SupprimerApprenant/{id}")
    public String supprimerApprenant(@PathVariable("id") Long id){
        apprenantService.deleteApprenant(id);
        return "Supprimer avec succès";
    }



}
