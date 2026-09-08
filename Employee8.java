abstract public class Employee8 {
    int salary;
    int hourlyRate = 1000;
    abstract int calculateSalary();

    public static void main(String[] args){
        FullTimeEmployee Israel = new FullTimeEmployee();
        PartTimeEmployee Dayo = new PartTimeEmployee(12);
        System.out.println(Dayo.calculateSalary());
        System.out.println(Israel.calculateSalary());
    }
}
class FullTimeEmployee extends Employee8{

    int calculateSalary() {
        salary = 40 * hourlyRate; //Per week
        return salary;
    }
}
class PartTimeEmployee extends Employee8{
    int number_of_hours_worked;
    PartTimeEmployee(int number_of_hours_worked){
        this.number_of_hours_worked = number_of_hours_worked;
    }
    int calculateSalary() {
        salary = number_of_hours_worked * hourlyRate; //Per week
        return salary;
    }
}
