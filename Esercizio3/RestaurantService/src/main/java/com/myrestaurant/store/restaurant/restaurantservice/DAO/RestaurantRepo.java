package com.myrestaurant.store.restaurant.restaurantservice.DAO;


import com.myrestaurant.store.restaurant.restaurantservice.model.restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends JpaRepository<restaurant, Long> {
}
