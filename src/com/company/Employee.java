package com.company;

public abstract class Employee {

    private String name;
    private int employeeID;
    private double baseSalary;
    private Employee manager;
    private static int numberOfEmployees = 0;
    private int headCount;

    public Employee (String name,double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        ++numberOfEmployees;
        this.employeeID = numberOfEmployees;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getEmployeeID () {
        return employeeID;
    }

    public void setEmployeeID (int employeeID) {
        this.employeeID = employeeID;
    }

    public double getBaseSalary () {
        return baseSalary;
    }

    public void setBaseSalary (double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Employee getManager () {
        return manager;
    }

    public void setManager (Employee manager) {
        this.manager = manager;
    }

    public int getHeadCount () {
        return headCount;
    }

    public void setHeadCount (int headCount) {
        this.headCount = headCount;
    }

    public boolean equals(Employee other){
        if(this.employeeID == other.employeeID){
            return true;
        }
        return false;
    }

    @Override
    public String toString () {
        return this.employeeID + " " + this.name;
    }

    public abstract String employeeStatus();
}
