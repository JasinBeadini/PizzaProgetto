package com.myrestaurant.store.PizzaRestaurantService.dto;

import com.myrestaurant.store.PizzaRestaurantService.model.Topping;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class PizzaDto {

    private Long id;

    private String name;

    private boolean favorite;

    private Set<Topping> toppings= new HashSet<>();

}
