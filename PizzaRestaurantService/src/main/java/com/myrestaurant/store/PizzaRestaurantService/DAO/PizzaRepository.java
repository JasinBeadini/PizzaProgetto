package com.myrestaurant.store.PizzaRestaurantService.DAO;

import com.myrestaurant.store.PizzaRestaurantService.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
