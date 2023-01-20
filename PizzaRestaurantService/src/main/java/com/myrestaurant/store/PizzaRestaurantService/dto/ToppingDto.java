package com.myrestaurant.store.PizzaRestaurantService.dto;

import com.myrestaurant.store.PizzaRestaurantService.model.Pizza;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class ToppingDto {

    private Long id;

    private String name;



}
