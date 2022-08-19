package com.cabbooking.service;

import java.util.List;

import com.cabbooking.exception.InvalidNumberException;
import com.cabbooking.exception.LocationNotFoundException;
import com.cabbooking.model.Cab;

public interface ICabService {
	List<Cab> getAll();
	List<Cab> getByCabType(String typeOfVehicle);
	List<Cab> getByPickupLocation(String pickup) throws LocationNotFoundException;
	List<Cab> getByDropLocation(String drop) throws LocationNotFoundException;
	List<Cab> getByPrice(double cost);
	Cab getByCabNumber(int cabNumber) throws InvalidNumberException;
}
