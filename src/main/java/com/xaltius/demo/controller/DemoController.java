package com.xaltius.demo.controller;

import com.xaltius.demo.model.UserDetails;

import com.xaltius.demo.utils.UserInfoUtil;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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

	private UserInfoUtil userInfoUtil = new UserInfoUtil();

	@PostMapping(value = "/age", consumes = "application/json")
	public @ResponseBody ResponseEntity<Object> verifyAge(@RequestBody UserDetails userDetails) {
		JSONObject json = new JSONObject();
		String backgroundClassName = userInfoUtil.getBackgroundClassName(userDetails.getYear());
		json.put("backgroundClassName", backgroundClassName);

		return new ResponseEntity<Object>(json.toString(), HttpStatus.OK);
	}
}