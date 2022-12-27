package org.student;

import org.department.Department;

public class Student extends Department {

	 public void studentName() {
		 System.out.println("Baskar");	
}
	 public void studentDept() {
		 System.out.println("Civil");
	 }
     public void studentId() {
    	 System.out.println("2018CE010");
     }
 public static void main(String[] args) {
	 Student my = new Student();
	 my.collegeName();
	 my.collegeCode();
	 my.collegeRank();
	 my.deptName();
	 my.studentName();
	 my.studentDept();
	 my.studentId();
}
}
