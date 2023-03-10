package com.myrestaurant.store.pizzarestaurant.pizzaservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class ToppingDTO {
    private Long id;
    private String name;

}
