package com.myrestaurant.store.pizzarestaurant.pizzaservice.mapper;

import com.myrestaurant.store.pizzarestaurant.pizzaservice.DTO.ToppingDTO;
import com.myrestaurant.store.pizzarestaurant.pizzaservice.model.Topping;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-25T13:04:03+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
@Component
public class ToppingMapperImpl implements ToppingMapper {

    @Override
    public Topping asEntity(ToppingDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Topping.ToppingBuilder topping = Topping.builder();

        topping.id( dto.getId() );
        topping.name( dto.getName() );

        return topping.build();
    }

    @Override
    public ToppingDTO asDTO(Topping entity) {
        if ( entity == null ) {
            return null;
        }

        ToppingDTO.ToppingDTOBuilder toppingDTO = ToppingDTO.builder();

        toppingDTO.id( entity.getId() );
        toppingDTO.name( entity.getName() );

        return toppingDTO.build();
    }

    @Override
    public List<Topping> asEntityList(List<ToppingDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Topping> list = new ArrayList<Topping>( dtoList.size() );
        for ( ToppingDTO toppingDTO : dtoList ) {
            list.add( asEntity( toppingDTO ) );
        }

        return list;
    }

    @Override
    public List<ToppingDTO> asDTOlist(List<Topping> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ToppingDTO> list = new ArrayList<ToppingDTO>( entityList.size() );
        for ( Topping topping : entityList ) {
            list.add( asDTO( topping ) );
        }

        return list;
    }
}
