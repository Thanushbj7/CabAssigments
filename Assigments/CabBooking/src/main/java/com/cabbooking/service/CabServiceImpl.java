package com.cabbooking.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabbooking.dao.ICabDAO;
import com.cabbooking.exception.InvalidNumberException;
import com.cabbooking.exception.LocationNotFoundException;
import com.cabbooking.model.Cab;
@Service
public class CabServiceImpl implements ICabService {
	@Autowired
ICabDAO cabDAO; 
	@Override
	public List<Cab> getAll() {
		
		  
		  return cabDAO.findAll();
	}

	@Override
	public List<Cab> getByCabType(String typeOfVehicle) {
		List<Cab> details =cabDAO.findByCabType(typeOfVehicle);
		return details;
	}

	@Override
	public List<Cab> getByPickupLocation(String pickup) throws LocationNotFoundException {
		List<Cab> details =cabDAO.findByPickupLocation(pickup);
		return details;
	}

	@Override
	public List<Cab> getByDropLocation(String drop) throws LocationNotFoundException {
		List<Cab> details =cabDAO.findByDropLocation(drop);
		return details;
	}

	@Override
	public List<Cab> getByPrice(double cost) {
		List<Cab> details =cabDAO.findByPrice(cost);
		return details;
	}

	@Override
	public Cab getByCabNumber(int cabNumber) throws InvalidNumberException {
		Cab details =cabDAO.findByCabNumber(cabNumber);
		return details;
	}

}
