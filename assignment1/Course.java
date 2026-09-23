package assignment1;
public class Course{

    private String courseCode;
    private String courseTitle;
    private int creditUnit;
    private String grade;

    Course(String courseCode, String courseTitle, int creditUnit, String grade){
        this.courseCode=courseCode;
        this.courseTitle = courseTitle;
        this.creditUnit = creditUnit;
        this.grade = grade;
    }
}