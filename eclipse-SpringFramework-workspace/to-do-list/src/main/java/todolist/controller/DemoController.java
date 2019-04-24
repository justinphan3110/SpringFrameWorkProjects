package todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;
import todolist.service.DemoService;

@Slf4j
@Controller

public class DemoController {
	
	// == fields ==
	private final DemoService demoService;
	// ==constructor == 
	@Autowired
	public DemoController(DemoService demoService) {
		this.demoService = demoService;
	}
	
	//== request method ==
	// http://localhost:8080/to-do-list/hello
	@ResponseBody
	@GetMapping("/hello")
	public String hello() {
		return "hello"; 
		
	}
	
	// http://localhost:8080/to-do-list/welcome
	@GetMapping("welcome")
	public void welcome(Model model) {
		model.addAttribute("helloMessage", this.demoService.getHelloMessage("Long"));
		log.info("Model {}", model);
	}
	
	
	// == model attribute == 
	// Add Attribute directly into 
	@ModelAttribute("welcomeMessage")
	public String welcomeMessage() {
		log.info("Welcome Message run");
		return this.demoService.getWelcomeMessage();
	}
}
