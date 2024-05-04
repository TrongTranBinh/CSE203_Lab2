package tranbinhtrong.question3;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {

    private ArrayList<Employee> listEmployee;

    public EmployeeManagement() {
    }

    public void getEmployees() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employee: ");
        int n = sc.nextInt();
        listEmployee = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Employee emp1 = new Employee();
            emp1.inputEmployeeDetails();
            listEmployee.add(emp1);
        }
    }

    public void salarySheet() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listEmployee.size(); i++) {
            listEmployee.get(i).calculateSalary();
            sb.append(listEmployee.get(i).getName()).append(": ").append(listEmployee.get(i).getSalary()).append("\n");
        }
        System.out.print(sb);
    }

    public void findHighestSalaries() {
        StringBuilder sb = new StringBuilder();
        double max = listEmployee.get(0).getSalary();
        for (int i = 0; i < listEmployee.size(); i++) {
            max = (max > listEmployee.get(i).getSalary()) ? max : listEmployee.get(i).getSalary();
        }
        for (int i = 0; i < listEmployee.size(); i++) {
            if (max == listEmployee.get(i).getSalary());
            sb.append(listEmployee.get(i).getName()).append("\n");
        }
        System.out.print(sb);
    }
}
