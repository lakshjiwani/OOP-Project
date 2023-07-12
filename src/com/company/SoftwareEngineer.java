package com.company;

public class SoftwareEngineer extends TechnicalEmployee {

    private boolean codeAccess;

    public SoftwareEngineer (String name) {
        super (name);
        this.codeAccess = false;
        this.setSuccessfulCheckins (0);
    }

    public boolean getCodeAccess(){
        return codeAccess;
    }

    public void setCodeAccess(boolean codeAccess){
        this.codeAccess = codeAccess;
    }


    public int getSuccessfulCheckins () {
        return this.getSuccessfulCheckins ();
    }

    public boolean checkInCode() {

        boolean isApprove = ((TechnicalLead) getManager()).approveCheckIn(this);
        if (isApprove) {
            this.setSuccessfulCheckins (getSuccessfulCheckins () + 1);
            return true;
        }else{
            return false;
        }
    }
}

