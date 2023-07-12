package com.company;

public class TechnicalEmployee extends Employee{

    private int successfulCheckins;

    public TechnicalEmployee (String name) {
        super (name,75000);
    }

    public int getSuccessfulCheckins () {
        return successfulCheckins;
    }

    public void setSuccessfulCheckins (int successfulCheckins) {
        this.successfulCheckins = successfulCheckins;
    }

    @Override
    public String employeeStatus () {
        return super.toString () + " has " + this.successfulCheckins + " successful check ins." ;
    }
}
