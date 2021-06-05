package com.ecom.review.service.reviews.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewsServiceController {

	
	@GetMapping
	public String testController() {
		return "hello reviews Service";
	}
}
