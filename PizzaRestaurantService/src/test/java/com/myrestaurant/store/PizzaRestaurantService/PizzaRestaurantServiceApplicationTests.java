package com.myrestaurant.store.PizzaRestaurantService;

import com.myrestaurant.store.PizzaRestaurantService.DAO.PizzaRepository;
import com.myrestaurant.store.PizzaRestaurantService.model.Pizza;
import com.myrestaurant.store.PizzaRestaurantService.model.Topping;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@SpringBootTest
class PizzaRestaurantServiceApplicationTests {

	@Autowired
	PizzaRepository PizzaRepository;

    @Test
    void populateDB() {

        Topping mozzarella = Topping.builder()
                .name("Mozzarella locale")
                .build();

		Topping peperoncino = Topping.builder()
				.name("Peperoncino")
				.build();

		Topping alici = Topping.builder()
				.name("alici")
				.build();

		Topping pomodoro= Topping.builder()
				.name("Pomodoro")
				.build();

		Topping basilico= Topping.builder()
				.name("Basilico")
				.build();

		Pizza Margherita= Pizza.builder()
				.name("Margherita")
				.favorite(true)
				.toppings(Set.of(mozzarella,pomodoro,basilico))
				.build();

		Pizza Nuova= Pizza.builder()
				.name("Nuova")
				.favorite(true)
				.toppings(Set.of(mozzarella,pomodoro,basilico, peperoncino))
				.build();


		PizzaRepository.saveAll(
				List.of(Margherita)
		);

    }

}
