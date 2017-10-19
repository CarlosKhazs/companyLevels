package States;

import Observers.*;

/**
 * Created by carlos on 12/10/17.
 */
public class Startup extends ObserverEntity implements CompanyState {

    public Startup() {
        Observer observerStaff = new Staff();

        addObserver(observerStaff);

        callNotifiers();
        System.out.println("< The company is still a STARTUP level >");
    }

    @Override
    public void doSupportContact() {
        System.out.println("Support through web chat with a real person.");
    }

    @Override
    public void doCompanyAudit() {
        System.out.println("Auditorship for few days.");
    }

    @Override
    public void payBills() {
        System.out.println("Financially it has some negative balance");
    }
}
