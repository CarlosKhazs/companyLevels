package States;

/**
 * Created by carlos on 12/10/17.
 */
public class Enterprise implements CompanyState {

    public Enterprise() {
        System.out.println("< The company goes into ENTERPRISE level >");
    }

    @Override
    public void doSupportContact() {
        System.out.println("Support also through some bot applications.");
    }

    @Override
    public void doCompanyAudit() {
        System.out.println("Auditorship for few weeks.");
    }

    @Override
    public void payBills() {
        System.out.println("Financially it has some bonus in balance");
    }
}
