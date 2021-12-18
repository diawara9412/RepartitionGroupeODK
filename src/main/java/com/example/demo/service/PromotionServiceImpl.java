package com.example.demo.service;

import com.example.demo.entity.Promotion;
import com.example.demo.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PromotionServiceImpl implements PromotionService{
    @Autowired
    PromotionRepository promotionRepository;
    @Override
    public Promotion savePromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    @Override
    public Promotion updatePromotion(Promotion promotion, Long id) {
        Promotion promotion1 = promotionRepository.findById(id).get();
        promotion1.setNom(promotion.getNom());
        promotion1.setDate(promotion.getDate());


        return promotionRepository.save(promotion1);
    }

    @Override
    public String deletePromotion(Long id) {
        promotionRepository.deleteById(id);
        return "Promotion supprimer avec succèe";
    }

    @Override
    public Promotion promotionById(Long id) {
        return promotionRepository.findById(id).get();
    }

    @Override
    public List<Promotion> listPromotion(Promotion promotion) {
        return promotionRepository.findAll();
    }
}
