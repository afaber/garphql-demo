package com.drew.graphql.service;

import com.drew.graphql.model.House;
import com.drew.graphql.repo.HouseRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HouseService {

    private final HouseRepo houseRepo;

    public HouseService(HouseRepo houseRepo) {
        this.houseRepo = houseRepo;
    }

    @Transactional
    public House buildHouse(final String color, final String size, final String doors ){
        final House house = new House();
        house.setColor(color);
        house.setSize(size);
        house.setNumberOfDoors(doors);
        return this.houseRepo.save(house);
    }

    @Transactional
    public List<House> getAllHouses(final int count){
       return houseRepo.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional
    public Optional<House> getHouse(final Integer id){
        return houseRepo.findById(id);
    }


}
