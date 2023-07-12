package com.company;

public class BusinessEmployee extends Employee {

    private double bonusBudget;

    public BusinessEmployee (String name){
        super(name,50000);

    }

    public double getBonusBudget(){
        return bonusBudget;
    }

    public void setBonusBudget(double bonusBudget){
        this.bonusBudget = bonusBudget;
    }

    @Override
    public String employeeStatus(){
        return super.toString () + " with a budget of " + this.bonusBudget;
    }
}
