package com.cabbooking.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cabbooking.exception.InvalidNumberException;
import com.cabbooking.exception.LocationNotFoundException;
import com.cabbooking.model.Cab;
@Component
public class CabDAOImpl implements ICabDAO {

	@Override
	public List<Cab> findAll() {
		return showAllCabs();
	}

	@Override
	public List<Cab> findByCabType(String typeOfVehicle) {
		return showAllCabs().stream().filter((vehicleType)->vehicleType.getTypeOfVehicle().equalsIgnoreCase(typeOfVehicle)).collect(Collectors.toList());
	}

	@Override
	public List<Cab> findByPickupLocation(String pickup)throws LocationNotFoundException {
		return  showAllCabs().stream().filter((pickupPoint)->pickupPoint.getPickup().equalsIgnoreCase(pickup)).collect(Collectors.toList());
	}

	@Override
	public List<Cab> findByDropLocation(String drop)throws LocationNotFoundException{
		return showAllCabs().stream().filter((dropPoint)->dropPoint.getDrop().equalsIgnoreCase(drop)).collect(Collectors.toList());
	}

	@Override
	public List<Cab> findByPrice(double cost) {
		return showAllCabs().stream().filter((cabCost)->cabCost.getCost()==(cost)).collect(Collectors.toList());
	}

	@Override
	public Cab findByCabNumber(int cabNumber)throws InvalidNumberException{
		Optional<Cab> details=  showAllCabs().stream().filter((vehicleNumber)->vehicleNumber.getCabNumber()==(cabNumber)).findFirst();
		if(details.isPresent()) {
			return details.get();
		}
		return null;
	}
private List<Cab> showAllCabs(){
		
		return Arrays.asList(
				new Cab("Hunasamaranahalli","SLKGreenPark",100, "Car", 104),
				new Cab("Rajajinagar","SLKGreenPark",1000,"Bus",101));

}
}
