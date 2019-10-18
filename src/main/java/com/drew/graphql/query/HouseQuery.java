package com.drew.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.drew.graphql.model.House;
import com.drew.graphql.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class HouseQuery implements GraphQLQueryResolver {

    @Autowired
    HouseService houseService;

    public List<House> getHouses( int count){
        return houseService.getAllHouses(count);
    }

    public Optional<House> getHouse(final int id){
        return houseService.getHouse(id);
    }
}
