package Strategies;

/**
 * Created by carlos on 13/10/17.
 */
public class Invest implements IncomeType {
    @Override
    public void income() {
        System.out.println("The company is getting money from investments.");
    }
}
