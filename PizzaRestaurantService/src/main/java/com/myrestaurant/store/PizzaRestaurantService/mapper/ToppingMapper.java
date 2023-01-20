package com.myrestaurant.store.PizzaRestaurantService.mapper;

import com.myrestaurant.store.PizzaRestaurantService.dto.ToppingDto;
import com.myrestaurant.store.PizzaRestaurantService.model.Topping;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ToppingMapper extends GenericMapper<Topping, ToppingDto> {
}
