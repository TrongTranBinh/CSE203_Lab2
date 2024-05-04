package tranbinhtrong.question3;

import java.util.Scanner;

public class Employee {

    private String employeeCode;
    private String name;
    private int yearsOfService;
    private double salaryCoEfficient;
    private int basicSalary;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
    

    public Employee(String employeeCode, String name, int yearsOfService, double salaryCoEfficient, int basicSalary) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.yearsOfService = yearsOfService;
        this.salaryCoEfficient = salaryCoEfficient;
        this.basicSalary = basicSalary;
    }

    public Employee() {
    }

    public void inputEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee Code: ");
        employeeCode = sc.nextLine();
        System.out.print("Employee Name: ");
        name = sc.nextLine();
        System.out.print("Employee's years of service: ");
        yearsOfService = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee's salary coefficient: ");
        salaryCoEfficient = sc.nextDouble();
        System.out.print("Employee's basic salary: ");
        basicSalary = sc.nextInt();
    }

    public void calculateSalary() {
        salary = basicSalary * salaryCoEfficient;
    }
}
