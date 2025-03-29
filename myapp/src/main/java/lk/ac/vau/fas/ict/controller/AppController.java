package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;

@RestController
@RequestMapping("/app")
public class AppController {

	Student Bod=new Student("2020/ICT/99", "Bod smith", 24, "IT", 3.5);
	Student Alice=new Student("2020/ICT/100", "Alice", 23, "IT", 3.8);
	Student John=new Student("2020/ICT/101", "John", 22, "IT", 3.9);
	Student Peter=new Student("2020/ICT/102", "Peter", 21, "IT", 3.6);

	@GetMapping("/msg")
	public String MyMessage() {
		return "Hello SpringBoot";
	}
	
	@GetMapping("/name")
	public String MyName() {
		return "My name is SpringBoot";
	}

}
