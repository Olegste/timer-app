package com.example.herokudemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/timer")
	public String index() {
		return "timer";
	}
}