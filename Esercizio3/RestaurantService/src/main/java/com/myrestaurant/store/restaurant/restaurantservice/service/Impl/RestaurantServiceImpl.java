package com.myrestaurant.store.restaurant.restaurantservice.service.Impl;


import com.myrestaurant.store.restaurant.restaurantservice.DAO.RestaurantRepo;
import com.myrestaurant.store.restaurant.restaurantservice.model.restaurant;
import com.myrestaurant.store.restaurant.restaurantservice.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepo restaurantRepo;

    @Override
    public restaurant save(restaurant entity) {
        return restaurantRepo.save(entity);
    }

    @Override
    public List<restaurant> save(List<restaurant> entities) {
        return restaurantRepo.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        restaurantRepo.deleteById(id);
    }

    @Override
    public Optional<restaurant> findById(Long id) {
        return restaurantRepo.findById(id);
    }

    @Override
    public List<restaurant> findAll() {
        return restaurantRepo.findAll();
    }

    @Override
    public restaurant update(restaurant entity, Long id) {
        Optional<restaurant> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;

    }

}
