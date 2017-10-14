package Strategies;

/**
 * Created by carlos on 13/10/17.
 */
public class Announce implements IncomeType {
    @Override
    public void income() {
        System.out.println("The company gets money through the announcements.");
    }
}
