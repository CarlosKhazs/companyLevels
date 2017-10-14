package Builder;

import States.*;
import Strategies.*;

/**
 * Created by carlos on 12/10/17.
 */
public class Company {
    private String trademark;
    private int numberOfEmployees;
    private CompanyState companyState;
    private IncomeType incomeType;

    public void getTrademark() {
        System.out.println(trademark);
    }

    protected void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public void getNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

    protected void setNumberOfEmployees(int numberOfEmployees) {
        newStateAchieved(numberOfEmployees);
        this.numberOfEmployees = numberOfEmployees;
    }

    public void getIncomeType() {
        incomeType.income();
    }

    protected void setIncomeType(String incomeType) {
        this.incomeType = IncomeTypeFactory.getIncomeType(incomeType);
    }

    public void doSupportContact() {
        companyState.doSupportContact();
    }

    public void doCompanyAudit() {
        companyState.doCompanyAudit();
    }

    public void payBills() {
        companyState.payBills();
    }


    private void newStateAchieved(int numberOfEmployees) {
        this.companyState = CompanyStateFactory.getState(numberOfEmployees);
    }
}
