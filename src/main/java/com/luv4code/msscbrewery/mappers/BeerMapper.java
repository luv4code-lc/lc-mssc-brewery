package com.luv4code.msscbrewery.mappers;

import com.luv4code.msscbrewery.domain.Beer;
import com.luv4code.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
