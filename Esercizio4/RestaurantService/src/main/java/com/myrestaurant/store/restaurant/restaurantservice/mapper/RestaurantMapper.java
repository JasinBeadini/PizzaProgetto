package com.myrestaurant.store.restaurant.restaurantservice.mapper;


import com.myrestaurant.store.restaurant.restaurantservice.DTO.RestaurantDTO;
import com.myrestaurant.store.restaurant.restaurantservice.model.restaurant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantMapper extends GenericMapper<restaurant, RestaurantDTO> {
}
