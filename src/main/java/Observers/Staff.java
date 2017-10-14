package Observers;

/**
 * Created by carlos on 12/10/17.
 */
public class Staff implements Observer {
    @Override
    public void notifyWhenCompanyGrows() {
        System.out.println("The Staff was notified about the company's growth.");
    }
}
