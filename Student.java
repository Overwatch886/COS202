/*
Assignment:
For the test we wrote yesterday,
use Java GUI to take input and fill in the classes.
 The interface should be able to take a minimum of 10 students and display their information.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Student implements Course{
    int matricNum; // instance variable
    String name;// instance variable
    private String department;

    Student(int matricNum, String name, String department){

        this.matricNum = matricNum;
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
    String[] courses;

    public void enrollCourses(){
	System.out.print("So after checking the courses you registered for, I will say that ");
	if (courses.length < 5){
	    System.out.println("You must register for at least 5 courses");
        }
        else{
	    System.out.println("Your Course Registration was Successful");
	}
    }

	
    public static void main(String args[]) {
        JFrame frame = new JFrame("Student Registration Portal");

        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 2, 10, 10));
        frame.setVisible(true);

        JButton addStudentButton = new JButton("Add Student");
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



        //Buttons








        addStudentButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int matricNum;
                String matricInput = idInput.getText().trim();
                String name = nameInput.getText().trim();
                String department = departmentInput.getText().trim();
                if (matricInput.isEmpty() || name.isEmpty() || department.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please Fill In All Fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
                    return;

                } else {
                    matricNum = Integer.parseInt(matricInput);
                    Student student = new Student(matricNum, name, department);
                    JOptionPane.showMessageDialog(frame, "Student Added Successfully", "Operation Successful", JOptionPane.INFORMATION_MESSAGE);
                    student.courses = new String[]{"ENT211", "COS201", "MTH201", "MTH202", "COS202"};

                    student.enrollCourses();

                }
            }
            });



        //String name = JOptionPane.showInputDialog("Enter you name ");
        //String department = JOptionPane.showInputDialog("Enter you department! ");





    }
}
interface Course{
	void enrollCourses();
}
