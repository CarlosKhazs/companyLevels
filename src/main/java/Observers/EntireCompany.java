package Observers;

/**
 * Created by carlos on 12/10/17.
 */
public class EntireCompany implements Observer {
    @Override
    public void notifyWhenCompanyGrows() {
        System.out.println("The entire Company was notified about the growth.");
    }
}
