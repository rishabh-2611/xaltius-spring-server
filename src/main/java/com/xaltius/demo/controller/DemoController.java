package com.xaltius.demo.controller;

import com.xaltius.demo.model.UserDetails;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/process")
public class DemoController {
	
	@PostMapping(value="/age", consumes="application/json")
	public @ResponseBody ResponseEntity<Object> verifyAge(@RequestBody UserDetails userDetails) {
		JSONObject json = new JSONObject();

		if(userDetails.getAge()<= 20)
			json.put("message","You are a Teenager");
		else if(userDetails.getAge() >= 21 && userDetails.getAge() <= 50)
			json.put("message","You are an Adult");
		else 
			json.put("message","You are a Senior citizen, Take Care !");
		
		return new ResponseEntity<Object>(json.toString(), HttpStatus.OK);
	}	
}