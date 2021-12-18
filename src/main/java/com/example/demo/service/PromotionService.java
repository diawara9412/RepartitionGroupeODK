package com.example.demo.service;

import com.example.demo.entity.Promotion;

import java.util.List;

public interface PromotionService {
    Promotion savePromotion(Promotion promotion);
    Promotion updatePromotion(Promotion promotion,Long id);
    String deletePromotion(Long id);
    Promotion promotionById(Long id);
    List <Promotion> listPromotion(Promotion promotion);
}
