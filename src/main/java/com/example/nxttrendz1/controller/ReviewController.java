/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

package com.example.nxttrendz1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

import com.example.nxttrendz1.service.*;
import com.example.nxttrendz1.model.*;

@RestController
public class ReviewController {

    @Autowired
    private ReviewJpaService reviewJpaService;

    @GetMapping("/products/reviews")
    public ArrayList<Review> getReviews() {
        return reviewJpaService.getReviews();
    }
}