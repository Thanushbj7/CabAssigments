package com.cabbooking.dao;

import java.util.List;

import com.cabbooking.exception.InvalidNumberException;
import com.cabbooking.exception.LocationNotFoundException;
import com.cabbooking.model.Cab;

public interface ICabDAO {
	List<Cab> findAll();
	List<Cab> findByCabType(String typeOfVehicle);
	List<Cab> findByPickupLocation(String pickup) throws LocationNotFoundException;
	List<Cab> findByDropLocation(String drop) throws LocationNotFoundException;
	List<Cab> findByPrice(double cost);
	Cab findByCabNumber(int cabNumber) throws InvalidNumberException;
	
	
}
