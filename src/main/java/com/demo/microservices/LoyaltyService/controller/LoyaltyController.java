package com.demo.microservices.LoyaltyService.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoyaltyController {

	private static Logger LOGGER = LoggerFactory.getLogger(LoyaltyController.class);

	Map<String, String> pointsMap = new HashMap<>();

	@GetMapping("/points/{userId}")
	public String getLoyaltyPoints(@PathVariable String userId) {

		LOGGER.info("Enter LoyaltyController " + userId);

		String id = userId;

		pointsMap.put("1000", "80");
		pointsMap.put("1001", "81");
		pointsMap.put("1002", "82");
		pointsMap.put("1003", "83");

		LOGGER.info("Exit LoyaltyController " + userId);

		return pointsMap.get(id);
	}

}
