package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Properties.ApplicationProperties;

@RestController
@RequestMapping("/FriendFamily")
public class FriendFamilyController {
	
	@Autowired
	ApplicationProperties properties ;
	
	@GetMapping("/getMessage")
	public String get()
	{
		return properties.getMessage();
	}

}
