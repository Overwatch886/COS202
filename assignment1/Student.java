package assignment1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.Component;
public class Student extends Person{
    private String studentId; // instance variable
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
    public void validateCourseRegistration(Component parentFrame){
        if (courses.size() < 5){
            //System.out.println("You must register for at least 5 courses");
            JOptionPane.showMessageDialog(parentFrame, "Course Registration Requirement", "You must register for at least 5 courses", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            //System.out.println("Your Course Registration was Successful");
            JOptionPane.showMessageDialog(parentFrame, "Operation Successful", "Your Course registration was successful", JOptionPane.INFORMATION_MESSAGE);

        }
    }
    ArrayList<Course> courses = new ArrayList<>();

    public void enrollCourses(Component parentFrame){
        System.out.print("So after checking the courses you registered for, I will say that ");
        validateCourseRegistration(parentFrame);
    }
    public void calculateCGPA(Component parentFrame) {
        validateCourseRegistration(parentFrame);
        int totalCreditUnits = 0;
        int twgp = 0;

        for (Course course : courses) {
            try {
                int wgp = course.getCreditUnit() * course.getGradePoint();//wgp means weighted grade points
                totalCreditUnits += course.getCreditUnit();
                twgp += wgp;//twgp means total weight grade points
            }
            catch(IllegalArgumentException e){
                JOptionPane.showMessageDialog(parentFrame, "Invalid Grade", course.getCourseCode() + "has an invalid grade assigned to it", JOptionPane.WARNING_MESSAGE);
                break;
            }
            double cgpa = twgp / totalCreditUnits;
        }

    }
    public String getStudentId(){
        return studentId;
    }

    @Override
    public String toString() {
        return name + " ("+ studentId + ") ";
    }

}



