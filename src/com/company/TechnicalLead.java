package com.company;

import java.util.ArrayList;
import java.util.List;

public class TechnicalLead extends TechnicalEmployee {

    ArrayList <SoftwareEngineer> softwareEngineers = new ArrayList <SoftwareEngineer> ();

    public TechnicalLead (String name) {
        super (name);
        this.setManager (this);
        super.setBaseSalary (getBaseSalary () * 1.3);
        super.setHeadCount (4);
    }

    public boolean hasHeadCount(){
        if(softwareEngineers.size () < getHeadCount ()) {
            return true;
        }
        return false;
    }

    public boolean addReport(SoftwareEngineer e){
        if(hasHeadCount ()){
            softwareEngineers.add (e);
            return true;
        }
        return false;
    }

    public boolean approveCheckIn (SoftwareEngineer e) {
        if (softwareEngineers.contains (e) && e.getCodeAccess ()) {
            return true;
        }
        return false;
    }

    public boolean requestBonus(Employee accountant, double bonus) {
            return ((Accountant)accountant).approveBonus(bonus);
        }

    public String getTeamStatus(){
        StringBuilder sb = new StringBuilder();
        if (!softwareEngineers.isEmpty()) {
            sb.append(this.employeeStatus()).append(" and is managing:");
            for (SoftwareEngineer eng : softwareEngineers) {
                sb.append("\n" + eng.employeeStatus());
            }
            sb.append("\n");
            return sb.toString();
        }
        return this.employeeStatus() + " and no direct reports yet \n";
    }

    public List<SoftwareEngineer> getSoftwareEngineer(){
        return softwareEngineers;
    }
}

