package com.nttdata.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortController {
	
	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping("/port")
	public String getPort(Model model) {
		
		model.addAttribute("port", serverPort);
		
		return "port";
	}
	
	@GetMapping("/")
	public String redirect(Model model) {
		
		model.addAttribute("port", serverPort);
		
		return "port";
	}
	
}
