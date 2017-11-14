package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallController {
	
	@RequestMapping("getName")
	public String getName() {
		return "Nguyen Van Anh + D";
	}
	
}
