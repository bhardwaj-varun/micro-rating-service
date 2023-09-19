package com.vb.ratingservice.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Document("ratings")
public class Rating {
    @Id
    String ratingId;
    String userId;
    String hotelId;
    String feedback;
    int rating;
}
