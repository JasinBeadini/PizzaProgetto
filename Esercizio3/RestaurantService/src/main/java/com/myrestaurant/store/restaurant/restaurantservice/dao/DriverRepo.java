package com.myrestaurant.store.restaurant.restaurantservice.dao;


import com.myrestaurant.store.restaurant.restaurantservice.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Long> {
}
