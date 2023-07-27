package com.ibjects.carshowroom;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends MongoRepository<Car, ObjectId> {

    //Spring Data JPA uses the naming convention to generate queries based on the method name.
    // In this case, the method name starts with findBy, which tells Spring Data JPA to generate a query that finds entities by a specific property.
    // The rest of the method name (Origin in this case) is used to determine the property to search for.
    Optional<List<Car>> findByOrigin(String origin);

}
