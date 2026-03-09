public class Employee {
    double calculateSalary() {
        return 0;
    }
    public static void main(String[] args) {
        FullTimeEmployee f = new FullTimeEmployee();
        PartTimeEmployee p = new PartTimeEmployee();
        System.out.println("Full-time salary: " + f. calculateSalary());
        System.out.println("Part-time salary: " + p. calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary = 150000;
    double calculateSalary() {
        return monthlySalary;
    }
    
}
class PartTimeEmployee extends Employee {
    int hoursWorked = 20;
    double rate = 2000;

    double calculateSalary() {
        return hoursWorked *  rate;
    }
} 