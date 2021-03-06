package com.apap.tutorial4.repository;

import com.apap.tutorial4.model.FlightModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FlightDB extends JpaRepository<FlightModel, Long>{
	FlightModel findByPilotLicenseNumber (String licenseNumber);
	FlightModel findFlightById (Long id);
	FlightModel findFlightByFlightNumber(String flightNumber);
	
}
