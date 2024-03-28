package com.BikkadIT.RestCrudOperation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.RestCrudOperation.Entities.Student;
import com.BikkadIT.RestCrudOperation.Repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentServiceI {

	@Autowired
	StudentRepository studentRepository;
	
	
	@Override
	public boolean saveStudent(Student stu) {
		
		Student student = studentRepository.save(stu);
		
		if(student != null) {
			return true;
		}else {
		return false;
		}
	}


	@Override
	public List<Student> getAllStu() {
		List<Student> students = studentRepository.findAll();
		return students;
	}


	@Override
	public boolean updateStudent(Student stu) {
		Student student = studentRepository.save(stu);
		
		if(student != null) {
			return true;
		}else {
			return false;
		}
	}


	@Override
	public boolean deleteAllStu() {
		
		List<Student> students = studentRepository.findAll();
		if(students.isEmpty()) {
			return false;
		}else {
			studentRepository.deleteAll();
			return true;
		}
		
		
	}


	@Override
	public boolean updateStudents(List<Student> stus) {
		List<Student> students = studentRepository.saveAll(stus);
		if(students.isEmpty()) {
			return false;
		}else {
			return true;
		}
	}


	@Override
	public boolean saveAllStudents(List<Student> stus) {
		List<Student> students = studentRepository.saveAll(stus);
		if(students.isEmpty()) {
			return false;
		}else {
			return true;
		}
	}


	
	@Override
	public Student getStudentByIdQp(int id) {
		Student student = studentRepository.findById(id).get();
		return student;
	}


	@Override
	public Student getStudentByIdPp(int id) {
		Student student = studentRepository.findById(id).get();
		return student;
	}


	@Override
	public boolean deleteStudentByIdQp(int id) {
		boolean response = studentRepository.existsById(id);
		
		if(response) {
			studentRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
	}


	@Override
	public boolean deleteStudentByIdPp(int id) {
		boolean response = studentRepository.existsById(id);
		
		if(response) {
			studentRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}


	@Override
	public Student saveStudent1(Student stu) {
		Student student = studentRepository.save(stu);
		return student;
	}


	@Override
	public Student getStudentByIdQp1(int id) {
		Student student = studentRepository.findById(id).orElseThrow(()-> new RuntimeException("Student is not available")); // here orElseThrow method getting Student data from Optional class (Optional class have "value" variable and value variable contain Student data and that data return by orElseThrow Method)
		return student;
		
		
		//orElseThrow(supplier<T> exceptionSupplier)--here supplier is Functional Interface and it has one abstract method is get()
	    //here is get method from supplier Functional Interface---    T get();
	    //.orElseThrow(supplier<RuntimeException> = ()-> new RuntimeException("Student is not available")-- here internal execution
	    //In above important parts are====  1. "()"--This is one abstract method which Functional Interface have, You can pass arguments here if that method take arguments it depends upon that method
	    //2. "new RuntimeException("Student is not available")"--This is return type of Functional Interface Method
	}


	@Override
	public Student updateStudent1(Student stu, int id) {
		
		Student data = studentRepository.findById(id).orElseThrow(()-> new RuntimeException("Student is not available"));
		
		data.setStudentName(stu.getStudentName());
		data.setStudentAge(stu.getStudentAge());
		data.setStudentAddr(stu.getStudentAddr());
		
		Student st = studentRepository.save(data);
		
		
		return st;
	}


	

}
