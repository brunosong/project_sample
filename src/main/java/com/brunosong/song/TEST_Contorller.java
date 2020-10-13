package com.brunosong.song;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TEST_Contorller {
	
	@GetMapping("/")
	public String test1() {
		System.out.println("들어왔다");
		
		return "test";
	}
	
	
}
