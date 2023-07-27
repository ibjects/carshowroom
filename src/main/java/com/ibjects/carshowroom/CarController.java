package com.ibjects.carshowroom;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity; // Allow us to send a proper response withs status code etc.
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/getAllCars")
    public ResponseEntity<List<Car>> getAllCars() {
        return new ResponseEntity<List<Car>>(carService.allCars(), HttpStatus.OK);
    }

    @GetMapping("/getCar/{id}")
    public ResponseEntity<Optional<Car>> getCarById(@PathVariable ObjectId id) {
        return new ResponseEntity<Optional<Car>>(carService.carById(id), HttpStatus.OK);
    }

    @GetMapping("/getCarsByOrigin/{origin}")
    public ResponseEntity<Optional<List<Car>>> getCarsByOrigin(@PathVariable String origin) {
        return new ResponseEntity<Optional<List<Car>>>(carService.carsByOrigin(origin), HttpStatus.OK);
    }

}
