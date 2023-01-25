package it.corso.restaurantservice;

import it.corso.restaurantservice.dao.RestaurantRepository;
import it.corso.restaurantservice.model.Driver;
import it.corso.restaurantservice.model.Restaurant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@SpringBootTest
class RestaurantServiceApplicationTests {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Test
    void populateDB3() {
        Driver driver1 = Driver.builder().name("Driver1").build();
        Driver driver2 = Driver.builder().name("Driver2").build();
        Driver driver3 = Driver.builder().name("Driver3").build();
        Driver driver4 = Driver.builder().name("Driver4").build();
        Driver driver5 = Driver.builder().name("Driver5").build();
        Driver driver6 = Driver.builder().name("Driver6").build();
        Restaurant provaPizza = Restaurant.builder().name("prova pizza")
                .address("Via Roma").city("Roma").drivers(Set.of(driver1, driver2, driver3)).build();
        Restaurant provaPizza2 = Restaurant.builder().name("prova seconda di pizza")
                .address("Via Napoli").city("Napoli").drivers(Set.of(driver4, driver5, driver6)).build();
        restaurantRepository.
                saveAll(List.of(provaPizza, provaPizza2));
    }

}
