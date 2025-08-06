package com.cg.eis.bean;

public class Employee {
    private long id;
    private String name;
    private int salary;
    private String designation;
    private String insuranceScheme;

    public Employee(long id, String name, int salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    public void setInsuranceScheme(String insuranceScheme) {
        this.insuranceScheme = insuranceScheme;
    }
}
