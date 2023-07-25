package com.ibjects.carshowroom;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    // Responsible for all Database Access Methods

    // We need a reference of the repository
    @Autowired // Automatically initialize the CarRepository Class
    private CarRepository carRepository;

    public List<Car> allCars() {
        return carRepository.findAll();
    }

    public Optional<Car> carById(ObjectId id) {
        return carRepository.findById(id);
    }

    public Optional<List<Car>> carsByOrigin(String origin) {
        return carRepository.findByOrigin(origin);
    }

}
