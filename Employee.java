class Employee {
    String name;
    int age;
    String department;
    double salary;
    int yearsOfExperience;
    int not_instantiated;

    Employee(String name, int age, String department, double salary, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public static void main(String[] args) {
        // I tried accessing an attribute of a non-static method
        // Employee Daniel;
        // System.out.print(Daniel.not_instanciated);
        // variable Daniel might not have been initialized is the error message
        // Uncomment the block of code to see the output if you try to use an attribute of an object
        // that has not been instantiated
        Employee[] Employees = new Employee[5];
        Employees = new Employee[]{
                new Employee("Israel", 17, "IT", 50000, 3),
                new Employee("Dayo", 19, "Agric", 100000, 10),
                new Employee("Oritsesan", 19, "HR", 2000000, 5),
                new Employee("Glory", 19, "HR", 5000, 3),
                // Employee("Wisdom", 18, "Admin", 59000, 3),
                // the method here is not instantiated and would return
                // Non-static method 'drive()' cannot be referenced from a static context
        };
        for (Employee Employee : Employees) {
            System.out.print(Employee.name + " ");
            System.out.print(Employee.age+" ");
            System.out.print(Employee.department+ " ");
            System.out.print(Employee.salary+" ");
            System.out.println(Employee.yearsOfExperience+ " ");
        }
    }
}