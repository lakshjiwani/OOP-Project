package com.company;

public class Accountant extends BusinessEmployee{

    private TechnicalLead teamSupported;

    public Accountant(String name) {
        super(name);
        this.setBonusBudget (0);
        this.teamSupported = null;
    }

    public TechnicalLead getTeamSupported () {
        return teamSupported;
    }

    public void setTeamSupported (TechnicalLead teamSupported) {
        this.teamSupported = teamSupported;
    }

    public void supportTeam(TechnicalLead lead){
        double sum = 0;
        this.teamSupported = lead;
        for(SoftwareEngineer eng : teamSupported.getSoftwareEngineer ()){
            sum +=eng.getBaseSalary ();
        }
        setBonusBudget (sum + (sum *0.10));
    }

    public boolean approveBonus(double bonus){
        if(bonus > getBonusBudget () && teamSupported == null){
            return true;
        }
        return false;
    }

    @Override
    public String employeeStatus () {
        return super.toString () + " with a budget of " + getBonusBudget () + " is supporting " + this.teamSupported;
    }

}
