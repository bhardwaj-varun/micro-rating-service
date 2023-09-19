package com.vb.ratingservice.controllers;



import com.vb.ratingservice.entities.Rating;
import com.vb.ratingservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;
    @GetMapping
    ResponseEntity<List<Rating>> getAllRatings(){
        return new ResponseEntity<>(ratingService.getAllRatings(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<Rating> getRatingById(@PathVariable String id){
        return new ResponseEntity<>(ratingService.getRatingById(id), HttpStatus.OK);
    }
    @GetMapping("/users/{userId}")
    ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId){
        return  new ResponseEntity<>(ratingService.getRatingsByUserId(userId), HttpStatus.OK);
    }

    @GetMapping("/hotels/{hotelId}")
    ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId){
        return  new ResponseEntity<>(ratingService.getRatingsByHotelId(hotelId), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        return  new ResponseEntity<>(ratingService.save(rating), HttpStatus.CREATED);
    }
}
