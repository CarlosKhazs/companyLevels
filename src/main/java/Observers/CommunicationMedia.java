package Observers;

/**
 * Created by carlos on 12/10/17.
 */
public class CommunicationMedia implements Observer {
    @Override
    public void notifyWhenCompanyGrows() {
        System.out.println("The Company's growth will be announced all over the world.");
    }
}
