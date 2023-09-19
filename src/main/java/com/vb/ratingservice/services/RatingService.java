package com.vb.ratingservice.services;

import com.vb.ratingservice.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {
    List<Rating> getAllRatings();
    Rating getRatingById(String id);
    Rating save(Rating rating);
    List<Rating> getRatingsByUserId(String userId);
    List<Rating> getRatingsByHotelId(String hotelId);
}
