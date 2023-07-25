package com.ibjects.carshowroom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "cars")
@Data // This will automatically create getter and setters and toString methods so that we don't have to write them
@AllArgsConstructor // create a constructor with all args
@NoArgsConstructor // create a constructor with no args
public class Car {

    @Id // This tells the compiler that this is going to be the unique identifier
    private ObjectId id;
    private String Name;
    private int Miles_per_Gallon;
    private int Cylinders;
    private int Displacement;
    private int Horsepower;
    private int Weight_in_lbs;
    private float Acceleration;
    private String Year;
    @Field("Origin") // Specify the MongoDB field name here
    private String origin;
}