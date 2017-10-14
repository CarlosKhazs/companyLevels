package Strategies;

import java.util.Objects;

/**
 * Created by carlos on 13/10/17.
 */
public class IncomeTypeFactory {
    public static IncomeType getIncomeType(String income) {
        if(Objects.equals(income, "investments")) {
            return new Invest();
        } else {
            return new Announce();
        }
    }
}
