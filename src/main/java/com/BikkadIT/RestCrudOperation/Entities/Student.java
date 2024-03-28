package com.BikkadIT.RestCrudOperation.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DTLS")
public class Student {

	//@Setter- For Creating Setter
	//@Getter- For Creating Getter
	//@AllArgsConstructor- For Creating Constructor with Arguments
	//@NoArgsConstructor- For Creating Constructor with no Arguments
	//@ToString- For Creating toString() method
	//For above annotation you have to add "Lambok" dependency while creating project
	
	
	
	@Id
	@Column(name="STUDENT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	@Column(name="STUDENT_NAME")
	private String studentName;
	
	@Column(name="STUDENT_ADDRESS")
	private String studentAddr;
	
	@Column(name="STUDENT_AGE")
	private String studentAge;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddr() {
		return studentAddr;
	}

	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddr=" + studentAddr
				+ ", studentAge=" + studentAge + "]";
	}
	
	
}
