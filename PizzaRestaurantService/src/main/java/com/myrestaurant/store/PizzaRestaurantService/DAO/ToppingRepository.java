package com.myrestaurant.store.PizzaRestaurantService.DAO;

import com.myrestaurant.store.PizzaRestaurantService.model.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingRepository  extends JpaRepository<Topping, Long> {
}
