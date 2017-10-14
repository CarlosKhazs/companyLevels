package States;

/**
 * Created by carlos on 12/10/17.
 */
public class Multinational implements CompanyState {

    public Multinational() {
        System.out.println("< The company goes into MULTINATIONAL level >");
    }

    @Override
    public void doSupportContact() {
        System.out.println("Support through all kind of communication.");
    }

    @Override
    public void doCompanyAudit() {
        System.out.println("Auditorship in full time.");
    }

    @Override
    public void payBills() {
        System.out.println("Financially it is always increasing its balance");
    }
}
