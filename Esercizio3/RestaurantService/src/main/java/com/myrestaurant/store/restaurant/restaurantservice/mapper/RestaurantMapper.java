package com.myrestaurant.store.restaurant.restaurantservice.mapper;


import com.myrestaurant.store.restaurant.restaurantservice.dto.RestaurantDTO;
import com.myrestaurant.store.restaurant.restaurantservice.model.Restaurant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantMapper extends GenericMapper<Restaurant, RestaurantDTO> {
}
