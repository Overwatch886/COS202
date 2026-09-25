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
import java.util.ArrayList;
import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Student Registration Portal");

        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        //Storing Students
        ArrayList<Student> studentsList = new ArrayList<>();

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 2));

        //
        JButton addStudentButton = new JButton("Add Student");
        JButton viewCourseRegistration = new JButton("View Course Registration");
        // Labels
        JLabel idInputLabel = new JLabel("Enter you Matric Number");
        JLabel nameInputLabel = new JLabel("Enter you Name ");
        JLabel departmentInputLabel = new JLabel("Enter your department ");

        //TextBoxes
        JTextField idInput = new JTextField(15);
        JTextField nameInput = new JTextField(15);
        JTextField departmentInput = new JTextField(15);

        // List of Students
        DefaultListModel<Student> studentListModel = new DefaultListModel<>();
        JList<Student> studentListView = new JList<>(studentListModel);
        JScrollPane scrollPane = new JScrollPane(studentListView);
        scrollPane.setPreferredSize(new Dimension(180, 0));
        scrollPane.setBorder(BorderFactory.createTitledBorder("Registered Students"));
        // Adding Elements to the window
        // Adding Labels and Textboxes
        formPanel.add(idInputLabel);
        formPanel.add(idInput);

        formPanel.add(nameInputLabel);
        formPanel.add(nameInput);

        formPanel.add(departmentInputLabel);
        formPanel.add(departmentInput);

        // Adding Button
        formPanel.add(addStudentButton);
        formPanel.add(viewCourseRegistration);
        //Add Student List
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(scrollPane, BorderLayout.EAST);

        // Creating 3 students obejcts to pre-exists in our database
        Student israel = new Student("250398", "Israel Olawuyi", "Computer Science");
        Student emmanuel = new Student("250559", "Sunday Emmanuel", "Mathematics");
        Student favour = new Student("250645", "Favour Adetunji", "Physics");
        studentsList.add(israel);
        studentsList.add(emmanuel);
        studentsList.add(favour);
        studentListModel.addElement(israel);
        studentListModel.addElement(emmanuel);
        studentListModel.addElement(favour);


        frame.setVisible(true);


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
                    studentListModel.addElement(student);
                    JOptionPane.showMessageDialog(frame, "Student Added Successfully", "Operation Successful", JOptionPane.INFORMATION_MESSAGE);
                    student.courses.add(new Course("ENT211", "Entrepreneurship and Innovation", 2, "A"));//{"ENT211", "COS201", "MTH201", "MTH202", "COS202"};

                    student.enrollCourses(frame);

                }
            }
        });

        viewCourseRegistration.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });
    Student selected = studentListView.getSelectedValue();
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
