package com.cg.eis.pl;

import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class Userinfo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        long id = sc.nextLong();
        sc.nextLine(); 

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        Employee emp = new Employee(id, name, salary, designation);

        Service service = new Service();
        emp.setInsuranceScheme(service.getInsuranceScheme(emp));

        service.displayEmployeeDetails(emp);

        sc.close();
    }
}
