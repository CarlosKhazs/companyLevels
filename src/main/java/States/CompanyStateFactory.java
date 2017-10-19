package States;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlos on 12/10/17.
 */
public class CompanyStateFactory {
    public static CompanyState getState(int employeesNumber) {
        if (employeesNumber >= 490) {
            return new Multinational();
        } else if (employeesNumber > 89) {
            return new Enterprise();
        } else {
            return new Startup();
        }
    }
}
