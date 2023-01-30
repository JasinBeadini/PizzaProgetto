package com.myrestaurant.store.RestaurantService.configuration;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"Prod"})
public class DataSourceConfigProd {

    public DataSourceConfigProd(){

        System.out.println("Into DataSourceConfigProd class!");
    }
}
