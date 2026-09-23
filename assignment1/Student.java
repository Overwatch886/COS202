package assignment1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Student extends Person{
    String studentId; // instance variable
    String name;// instance variable
    private String department;

    Student(String studentId, String name, String department){

        this.studentId = studentId;
        this.name = name;
        this.department = department;
	}
    public String getDepartment(){
	return department;
	}
    public String setDepartment(String newDepartment){
	department = newDepartment;
	return department;
	}
    ArrayList<Course> Courses = new ArrayList<>();

    public void enrollCourses(){
	System.out.print("So after checking the courses you registered for, I will say that ");
	if (Courses.size() < 5){
	    System.out.println("You must register for at least 5 courses");
        }
        else{
	    System.out.println("Your Course Registration was Successful");
	}
    }

	

}



