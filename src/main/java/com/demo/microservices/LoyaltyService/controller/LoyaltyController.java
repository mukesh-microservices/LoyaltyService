package com.demo.microservices.LoyaltyService.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoyaltyController {
	
	Map<String, String> pointsMap = new HashMap<>();
	
	@GetMapping("/points/{userId}")
	public String getLoyaltyPoints(@PathVariable String userId){
		
		String id = userId ;
		
		pointsMap.put("1000","80");
		pointsMap.put("1001","81");
		pointsMap.put("1002","82");
		pointsMap.put("1003","83");
		
		return pointsMap.get(id);
	}
	
	
	
}
