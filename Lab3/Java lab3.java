//to show the implimentation of Inheritance concept.

class Employee {
    int employeeId;
    double bonus, monthlysalary;
    String employeeName, designation;

    public Employee(int employeeId, String employeeName, String designation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
    }

    public Employee(){

    }
    public double calculateBonus(){

        return(bonus);
    }

    public int getEmployeeId() {

        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {

        return employeeName;
    }

    public void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;
    }

    public String getDesignation() {

        return designation;
    }

    public void setDesignation(String designation) {

        this.designation = designation;
    }
    public void display(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee designation: " + designation);


    }
}
class HourlyEmployee extends Employee{
    double hourlyRate, hourlyearnings;
    int hoursWorked;
    public HourlyEmployee(int employeeId, String employeeName, String designation, double hourlyRate, int hoursWorked) {
        super(employeeId, employeeName, designation);
    }


    public int getHoursWorked() {

        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked){

        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {

        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate){

        this.hourlyRate = hourlyRate;
    }
    public double Weekly() {
        hourlyearnings = hourlyRate * hoursWorked;
        System.out.println("Hourly Salary: " + hourlyearnings);

        return hourlyearnings;
    }

}

class SalariedEmployee extends Employee {

    double monthlySalary, weeklysalary;
    public SalariedEmployee(int employeeId, String employeeName, String designation, double monthlySalary) {
        super(employeeId, employeeName, designation);
    }

    public double getMonthlySalary() {

        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary){

        this.monthlySalary = monthlySalary;
    }


    public SalariedEmployee(double monthlySalary, double weeklysalary)
    {
        super();
    }
    public double SalariedEmployee(){
        weeklysalary=monthlySalary/4;
        System.out.println("Weekly earnings:" + weeklysalary);

        return(weeklysalary);
    }
}

class ExecutiveEmployee extends SalariedEmployee{

    double bonusPercentage;

    public ExecutiveEmployee(int employeeId, String employeeName, String designation,double monthlySalary, double weeklysalary) {
        super(monthlySalary, weeklysalary);
        this.monthlySalary = monthlySalary;

    }

    public double calculateBonus(){
        bonus= monthlysalary*8/100;
        System.out.println("Employee bonus: " + bonus);
        return (bonus);
    }

}
public class Emp {
    public static void main(String args[]) {
        Employee emp=new Employee();
        HourlyEmployee hourlyemp = new HourlyEmployee(1, "John", "Intern", 15.0, 40);
        SalariedEmployee salariedemp = new SalariedEmployee(2, "Ridha", "Manager", 5000.0);
        ExecutiveEmployee executiveemp = new ExecutiveEmployee(3, "Rahul", "Executive", 10000.0, 10.0);
        emp.getEmployeeId();
        emp.setEmployeeId(9);
        emp.getEmployeeName();
        emp.setEmployeeName("Ridha");
        emp.getDesignation();
        emp.setDesignation("IT Manager");
        emp.display();

        hourlyemp.getHoursWorked();
        hourlyemp.setHoursWorked(600);
        hourlyemp.getHourlyRate();
        hourlyemp.setHourlyRate(100);

        salariedemp.getMonthlySalary();
        salariedemp.setMonthlySalary(70000);
        hourlyemp.Weekly();
        salariedemp.SalariedEmployee();

        executiveemp.getMonthlySalary();

        executiveemp.calculateBonus();
    }
}

