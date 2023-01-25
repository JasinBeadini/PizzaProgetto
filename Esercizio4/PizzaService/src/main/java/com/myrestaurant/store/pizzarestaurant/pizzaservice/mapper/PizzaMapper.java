package com.myrestaurant.store.pizzarestaurant.pizzaservice.mapper;


import com.myrestaurant.store.pizzarestaurant.pizzaservice.DTO.PizzaDTO;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.model.Pizza;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PizzaMapper extends GenericMapper<Pizza, PizzaDTO> {
}
