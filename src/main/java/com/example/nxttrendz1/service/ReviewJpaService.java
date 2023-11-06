/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

package com.example.nxttrendz1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.*;

import com.example.nxttrendz1.repository.*;
import com.example.nxttrendz1.model.*;

@Service
public class ReviewJpaService implements ReviewRepository {

    @Autowired
    private ReviewJpaRepository reviewJpaRepository;

    @Override
    public ArrayList<Review> getReviews() {
        List<Review> reviewsList = reviewJpaRepository.findAll();
        ArrayList<Review> reviews = new ArrayList<>(reviewsList);

        return reviews;
    }
}