package com.BikkadIT.RestCrudOperation.Service;

import java.util.List;

import com.BikkadIT.RestCrudOperation.Entities.Student;

public interface StudentServiceI {

	public boolean saveStudent(Student stu);
	
	public List<Student> getAllStu();
	
	public boolean updateStudent(Student stu);
	
	public boolean deleteAllStu();
	
	public boolean updateStudents(List<Student> stus);
	
	public boolean saveAllStudents(List<Student> stus);
	
	public Student getStudentByIdQp(int id);
	
	public Student getStudentByIdPp(int id);
	
	public boolean deleteStudentByIdQp(int id);
	
	public boolean deleteStudentByIdPp(int id);
	
	public Student saveStudent1(Student stu);
	
	public Student getStudentByIdQp1(int id);
	
	public Student updateStudent1(Student stu, int id);
}
