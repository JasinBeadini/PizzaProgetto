package com.myrestaurant.store.restaurant.restaurantservice.mapper;


import com.myrestaurant.store.restaurant.restaurantservice.DTO.DriverDTO;
import com.myrestaurant.store.restaurant.restaurantservice.model.Driver;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DriverMapper extends GenericMapper<Driver, DriverDTO> {
}
