package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;


import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping("/app")
public class AppController {

	Student Bod=new Student("2020ICT99", "Bod smith", 24, "IT", 3.5);
	Student Alice=new Student("2020ICT100", "Alice", 23, "IT", 3.8);
	Student John=new Student("2020ICT101", "John", 22, "IT", 3.9);
	Student Peter=new Student("2020ICT102", "Peter", 21, "IT", 3.6);

	List<Student> students=new ArrayList<Student>();

	public AppController(){
		students.add(Bod);
		students.add(Alice);
		students.add(John);
		students.add(Peter);
	}
	@GetMapping("/msg")
	public String MyMessage() {
		return "Hello SpringBoot";
	}
	
	@GetMapping("/name")
	public String MyName() {
		return "My name is SpringBoot";
	}

	@GetMapping("/age/{ag}")
	public String MyAge(@PathVariable("ag") int age){
		return "My age is " + age;
	}

	@GetMapping("/student")
	public Student geStudent(){
		return Bod;
	}

	@GetMapping("/students")
	public List<Student> getStudnts(){
	
		return students;

	}

	@GetMapping("/students/{regNo}")
	public Student getStudentByRegNo(@PathVariable("regNo") String regNo){
		for(Student student:students){
			if(student.getRegNo().equals(regNo)){
				return student;
			}
		}
		return null;
	}
	
	@GetMapping("students/age")
	public List<Student> getStudentByAge(){
		List<Student> filterStudents=new ArrayList<Student>();
		for(Student student:students){
			if(student.getAge()>=20 && student.getAge()<23){
				filterStudents.add(student);
			}
		}
		return filterStudents;
	}

	@GetMapping("/students/sort/gpa")
	public List<Student> getStudentsSortedByGpa(){
		students.sort((s1,s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
		return students;
	}

	@PostMapping("/students/add")
	public List<Student> addStudent(@RequestBody Student student){
		students.add(student);
		return students;
	}


}
