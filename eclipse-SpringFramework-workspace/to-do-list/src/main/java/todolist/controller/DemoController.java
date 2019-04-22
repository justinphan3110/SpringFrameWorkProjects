package todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class DemoController {
	
	// http://localhost:8080/to-do-list/hello
	@ResponseBody
	@GetMapping("/hello")
	public String hello() {
		return "hello"; 
		
	}
	
	// http://localhost:8080/to-do-list/welcome
	@GetMapping("welcome")
	public void welcome(Model model) {
		model.addAttribute("user", "Long");
		log.info("Model {}", model);
	}
	
	// Add Attribute directly into 
	@ModelAttribute("welcomeMessage")
	public String welcomeMessage() {
		log.info("Welcome Message run");
		return "Welcome to this Demo View";
	}
}
