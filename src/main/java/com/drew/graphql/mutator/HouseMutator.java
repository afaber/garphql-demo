package com.drew.graphql.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.drew.graphql.model.House;
import com.drew.graphql.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HouseMutator implements GraphQLMutationResolver {

    @Autowired
    HouseService houseService;

    public House buildHouse(final String size, final String color, final String doors){
        return houseService.buildHouse(color,size,doors);
    }
}
