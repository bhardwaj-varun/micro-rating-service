package com.vb.ratingservice.services.impl;

import com.vb.ratingservice.entities.Rating;
import com.vb.ratingservice.exceptions.ResourceNotFoundException;
import com.vb.ratingservice.repositories.RatingRepository;
import com.vb.ratingservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public Rating getRatingById(String id) {
        return ratingRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Rating not found with the given id"));
    }

    @Override
    public Rating save(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatingsByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingsByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }

}
