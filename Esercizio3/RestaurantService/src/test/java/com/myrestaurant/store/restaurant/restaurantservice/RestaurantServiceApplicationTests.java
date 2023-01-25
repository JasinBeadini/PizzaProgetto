package com.myrestaurant.store.restaurant.restaurantservice;

import com.myrestaurant.store.restaurant.restaurantservice.DAO.RestaurantRepo;
import com.myrestaurant.store.restaurant.restaurantservice.model.Driver;
import com.myrestaurant.store.restaurant.restaurantservice.model.restaurant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@SpringBootTest
class RestaurantServiceApplicationTests {

    @Autowired
    RestaurantRepo restaurantRepo;

    @Test
    void populateDBRestaurantDriver() {
        Driver driver1 = Driver.builder().name("Driver1").build();
        Driver driver2 = Driver.builder().name("Driver2").build();
        Driver driver3 = Driver.builder().name("Driver3").build();
        Driver driver4 = Driver.builder().name("Driver4").build();
        Driver driver5 = Driver.builder().name("Driver5").build();
        Driver driver6 = Driver.builder().name("Driver6").build();
        restaurant vogliaDiPizza = restaurant.builder().name("Voglia di pizza").address("Via Roma").city("Roma").drivers(Set.of(driver1, driver2, driver3)).build();
        restaurant pizzaAGoGo = restaurant.builder().name("Pizza a GoGo").address("Via Milano").city("Milano").drivers(Set.of(driver4, driver5, driver6)).build();
        restaurantRepo.saveAll(List.of(vogliaDiPizza, pizzaAGoGo));
    }
}