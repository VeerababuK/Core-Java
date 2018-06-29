package chapter1.oop.inheritance;

public class Employee extends Person {
    private double salary;
    // Emp ID, doj, designation, department, skill-set, employee_email

    private Employee reportingManger;


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getReportingManger() {
        return reportingManger;
    }

    public void setReportingManger(Employee reportingManger) {
        this.reportingManger = reportingManger;
    }
}
