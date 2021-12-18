package com.example.demo.controller;

import com.example.demo.entity.Promotion;
import com.example.demo.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PromotionController {
    @Autowired
    PromotionService promotionService;
    @PostMapping("AjouPromotion")
    public Promotion ajouterpromotion(@RequestBody Promotion promotion){
        return promotionService.savePromotion(promotion);
    }
    @GetMapping("ListPromotion")
    public List <Promotion> listPromotion(Promotion promotion){
        return promotionService.listPromotion(promotion);
    }
    @GetMapping("Promotion/{id}")
    public Promotion promotionById(@PathVariable("id") Long id){
        return promotionService.promotionById(id);
    }
    @PutMapping("ModifierPromotion/{id}")
    public Promotion modifierPromotion(@RequestBody Promotion promotion ,@PathVariable ("id") Long id){
        return promotionService.updatePromotion(promotion,id);
    }
    @DeleteMapping("SupprimerPromotion/{id}")
    public  String supprimerPromotion(@PathVariable("id") Long id){
        promotionService.deletePromotion(id);
        return "Supprimer avec Succès";
    }
}
