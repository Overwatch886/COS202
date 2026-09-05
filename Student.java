class Student {
    int matricNum; // instance variable
    String name;// instance variable
    String department;
    public static void main(String args[]) {
        Student new_student_1 = new Student();
        Student new_student_2 = new Student();
        System.out.println(new_student_1.matricNum);
        System.out.println(new_student_1.name);
        System.out.println(new_student_1.department);
        System.out.println(new_student_2.matricNum);
        System.out.println(new_student_2.name);
        System.out.println(new_student_2.department);
    }
}