package com.ashworth.william.springboot.database.garage.garageSpringBootDatabaseApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashworth.william.springboot.database.garage.garageSpringBootDatabaseApp.model.GarageSpringBootModel;

@Repository
public interface GarageSpringBootRepository extends JpaRepository<GarageSpringBootModel, Long>
{
	
}
