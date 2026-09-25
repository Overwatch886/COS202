/*
Assignment:
For the test we wrote yesterday,
use Java GUI to take input and fill in the classes.
 The interface should be able to take a minimum of 10 students and display their information.
 */

package assignment1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Student Registration Portal");

        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 2, 10, 10));
        frame.setVisible(true);
        //Storing Students
        ArrayList<Student> studentsList = new ArrayList<>();

        //
        JButton addStudentButton = new JButton("Add Student");
        JButton viewStudents = new JButton("View Students");
        // Labels
        JLabel idInputLabel = new JLabel("Enter you Matric Number");
        JLabel nameInputLabel = new JLabel("Enter you Name ");
        JLabel departmentInputLabel = new JLabel("Enter your department ");

        //TextBoxes
        JTextField idInput = new JTextField(15);
        JTextField nameInput = new JTextField(15);
        JTextField departmentInput = new JTextField(15);

        // Adding Elements to the window
        // Adding Labels and Textboxes
        frame.add(idInputLabel);
        frame.add(idInput);

        frame.add(nameInputLabel);
        frame.add(nameInput);

        frame.add(departmentInputLabel);
        frame.add(departmentInput);

        // Adding Button
        frame.add(addStudentButton);



        addStudentButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String matricInput = idInput.getText().trim();
                String name = nameInput.getText().trim();
                String department = departmentInput.getText().trim();
                if (matricInput.isEmpty() || name.isEmpty() || department.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please Fill In All Fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
                    return;

                } else {
                    Student student = new Student(matricInput, name, department);
                    studentsList.add(student);
                    JOptionPane.showMessageDialog(frame, "Student Added Successfully", "Operation Successful", JOptionPane.INFORMATION_MESSAGE);
                    student.Courses.add(new Course("ENT211", "Entrepreneurship and Innovation", 2, "A1"));//{"ENT211", "COS201", "MTH201", "MTH202", "COS202"};

                    student.enrollCourses();

                }
            }
        });

/*
* ===============================================
UNIVERSITY OF IBADAN - FACULTY OF COMPUTING
STUDENT PROFILE
===============================================
Student ID : UI/CSC/2026/001
Name
: John Ade
Department : Computer Science
Courses Registered: 5
---------------------------------------------------------------
Course Code
Course Title
CU
Grade
---------------------------------------------------------------
CSC201
Data Structures
3
A
CSC203
Computer Architecture
3
B
MTH201
Mathematics II
3
A
CSC205
Programming II
3
B
STA201
Statistics
2
C
---------------------------------------------------------------
Total Credit Units : 14
CGPA
: 4.07
===============================================*/

        //String name = JOptionPane.showInputDialog("Enter you name ");
        //String department = JOptionPane.showInputDialog("Enter you department! ");





    }
}
