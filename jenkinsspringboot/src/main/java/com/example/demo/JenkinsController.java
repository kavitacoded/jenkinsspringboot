package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	@RequestMapping(value="/")
	public String jen() {
		return "welcome to Jenkins cicd bbvghghghcontinuous integretions devops ";
	}
	
}
