package com.BikkadIT.RestCrudOperation.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.RestCrudOperation.Entities.Student;
import com.BikkadIT.RestCrudOperation.Service.StudentServiceI;

@RestController
public class StudentController {

	@Autowired
	StudentServiceI studentServiceI;
	
	@PostMapping(value="/SaveStudent" , consumes="application/json")
	public ResponseEntity<String> saveStudent(@RequestBody Student stu) {
		
		boolean student = studentServiceI.saveStudent(stu);
		
		if(student) {
			String msg="Student Saved Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);//If we use HttpStatus.OK then also fine
		}else {
			String msg="Student Not Saved Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);//If we use HttpStatus.OK then also fine
		}
		
	}
	
	@GetMapping(value="/getAllStu" , produces="application/json")
	public ResponseEntity<List<Student>> getAllStu(){
		
		List<Student> students = studentServiceI.getAllStu();
		
		return new ResponseEntity(students,HttpStatus.OK);
		
	}
	
	@GetMapping(value="/getAllStu1" , produces="application/json")//It will also run in postman
	public List<Student> getAllStu1(){
		
		List<Student> students = studentServiceI.getAllStu();
		
		return students ;
		
	}
	
	
	
	@PutMapping(value="updateStudent" , consumes="application/json")
	public ResponseEntity<String> updateStudent(@RequestBody Student stu){
		
		boolean response = studentServiceI.updateStudent(stu);
		
		if(response) {
			String msg="Student Updated Succesfully";
			return new ResponseEntity(msg,HttpStatus.CREATED);
		}else {
			String msg="Student Not Updated Successfully";
			return new ResponseEntity(msg,HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/deleteAllStu")
	public ResponseEntity<String> deleteAllStu(){
		
		boolean result = studentServiceI.deleteAllStu();
		
		if(result) {
			String msg="Students Deleted Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}else {
			String msg="Students Not Deleted Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping(value="/updateStudents" , consumes="application/json")
	public ResponseEntity<String> updateStudents(@RequestBody List<Student> stus){
		
		boolean result = studentServiceI.updateStudents(stus);
		
		if(result) {
			String msg="Students Updated Successfully";
			return new ResponseEntity(msg,HttpStatus.OK);
		}else {
			String msg="Students NOt Updated Successfully";
			return new ResponseEntity(msg,HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping(value="/saveAllStudents" , consumes="application/json")
	public ResponseEntity<String> saveAllStudents(@RequestBody List<Student> stus){
		
		boolean result = studentServiceI.saveAllStudents(stus);
		
		if(result) {
			String msg="Students Saved Successfully";
			return new ResponseEntity(msg,HttpStatus.OK);
		}else {
			String msg="Student Not Saved Successfully";
			return new ResponseEntity(msg,HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value="/getStudentByIdQp" , produces="application/json")
	public ResponseEntity<Student> getStudentByIdQp(@RequestParam int id) {
		
		Student student = studentServiceI.getStudentByIdQp(id);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
	}

	@GetMapping(value="/getStudentByIdPp/{id}" , produces="application/json")
	public ResponseEntity<Student> getStudentByIdPp(@PathVariable int id) {
		Student student = studentServiceI.getStudentByIdPp(id);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteStudentById")
	public ResponseEntity<String> deleteStudentByIdQp(@RequestParam int id){
		boolean response = studentServiceI.deleteStudentByIdQp(id);
		
		if(response) {
			String msg="Student Deleted Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}else {
			String msg="Student Not Deleted Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/deleteStudentIdPp/{id}")
	public ResponseEntity<String> deleteStudentIdPp(@PathVariable int id){
		
		boolean response = studentServiceI.deleteStudentByIdPp(id);
		
		if(response) {
			String msg="Student Deleted Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}else {
			String msg="Student Not Deleted Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@RequestMapping(value="/saveStudent1" , method=RequestMethod.POST)
	public ResponseEntity<Student> saveStudent1(@RequestBody Student stu){
		
		Student student = studentServiceI.saveStudent1(stu);
		return new ResponseEntity(student,HttpStatus.OK);
	}
	
	@GetMapping(value="/getStudentByIdQp1" , produces="application/json")
	public ResponseEntity<Student> getStudentByIdQp1(@RequestParam int id){
		
		Student student = studentServiceI.getStudentByIdQp1(id);
		return new ResponseEntity(student, HttpStatus.OK);
	}
	
	@PutMapping(value="/updateStudent1/{id}" , consumes="application/json" , produces="application/json")
	public ResponseEntity<Student> updateStudent1(@RequestBody Student stu,@PathVariable int id){
		
		Student st = studentServiceI.updateStudent1(stu, id);
		
		return new ResponseEntity<Student>(st,HttpStatus.CREATED);
		
	}
}
