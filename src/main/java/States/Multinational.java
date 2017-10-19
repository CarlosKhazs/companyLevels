package States;

import Observers.*;

/**
 * Created by carlos on 12/10/17.
 */
public class Multinational extends ObserverEntity implements CompanyState {

    public Multinational() {
        Observer observerStaff = new Staff();
        Observer observerEntireCompany = new EntireCompany();
        Observer observerCommunicationMedia = new CommunicationMedia();

        addObserver(observerStaff);
        addObserver(observerEntireCompany);
        addObserver(observerCommunicationMedia);

        callNotifiers();
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
