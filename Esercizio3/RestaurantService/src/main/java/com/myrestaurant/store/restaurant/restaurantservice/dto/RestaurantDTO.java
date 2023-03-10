package com.myrestaurant.store.restaurant.restaurantservice.dto;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class RestaurantDTO {
    private Long id;
    private String name;
    private String address;
    private String city;
    private Set<DriverDTO> drivers = new HashSet<>();

}
