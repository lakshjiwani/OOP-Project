package com.company;


import java.util.ArrayList;
import java.util.List;

public class BusinessLead extends BusinessEmployee {

    private List<Accountant> accountants = new ArrayList<Accountant> ();


    public BusinessLead(String name) {
        super(name);
        setManager(this);
        setBaseSalary(getBaseSalary() * 2);
        super.setHeadCount (10);
    }


    public boolean hasHeadCount() {
        if( accountants.size() < getHeadCount () ){
            return true;
        }
        return false;
    }


    public boolean addReport(Accountant acc, TechnicalLead supportTeam) {
        if (hasHeadCount()) {
            accountants.add(acc);
            acc.supportTeam(supportTeam);
            acc.setManager(this);
            setBonusBudget(getBonusBudget() + (acc.getBaseSalary() * 1.1));
            return true;
        }
        return false;
    }

    public boolean requestBonus(Employee e, double bonus){
        if( bonus <= getBonusBudget ()){
            this.setBonusBudget (getBonusBudget () - bonus);

            return true;
        }
        return false;
    }

    public boolean approveBonus(Employee lead, double bonus) {
        for (Accountant acc : accountants) {
            if (acc.getTeamSupported().equals(lead)) {
                if (acc.approveBonus(bonus)) {
                    return true;
                }
            }
        }
        return false;
    }


    public String getTeamStatus() {
        StringBuilder sb = new StringBuilder();
        if (!accountants.isEmpty()) {
            sb.append(this.employeeStatus()).append(" and is managing:");
            for (Accountant acc : accountants) {
                sb.append("\n" + acc.employeeStatus());
            }
            return sb.toString();
        }
        return this.employeeStatus() + " and no direct reports yet";

    }


}
