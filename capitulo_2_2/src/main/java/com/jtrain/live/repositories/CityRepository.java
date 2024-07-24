package com.jtrain.live.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jtrain.live.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
