package com.cabbookingapp.repositery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.cabbookingapp.model.Cab;
@Repository
public class CabBookingRepositeryImpl implements ICabBookingRepositery {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CabBookingRepositeryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	

	@Override
	public void addCab(Cab cab) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCab(double cost, Integer cabNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCab(Integer cabNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cab> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cab> findByCabType(String typeOfVehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cab> findByPickupLocation(String pickup) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cab> findByDropLocation(String drop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cab> findByPrice(double cost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cab findByCabNumber(Integer cabNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
