package com.ibjects.carshowroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    // Repository is one of the ways to talk to the database.
    // Another way is using a template
    @Autowired
    private MongoTemplate mongoTemplate;

//    public Comment createComment(String commentBody, String carId) {
//
//        Comment comment = new Comment(commentBody);
//
//        commentRepository.insert(comment); // Comment inserted in its own collection
//
//        // Now we have to associate it with one of the car
//        // We'll use a template as it's good to have seen both words.
//
//    }
}
