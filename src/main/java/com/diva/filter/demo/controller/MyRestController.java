package com.diva.filter.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class MyRestController {

	@GetMapping
	public @ResponseBody ResponseEntity<String> requestCheck(){
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}
}
