package Builder;

/**
 * Created by carlos on 12/10/17.
 */
public class CompanyBuilder {
    private Company company;

    public CompanyBuilder createCompany() {
        company = new Company();
        return this;
    }

    public CompanyBuilder withTradeMark(String tradeMark) {
        company.setTrademark(tradeMark);
        return this;
    }

    public CompanyBuilder hasAEmployeesNumberOf(int employeeNumber) {
        company.setNumberOfEmployees(employeeNumber);
        return this;
    }

    public CompanyBuilder andTheMostIncomeComesFrom(String incomeType) {
        company.setIncomeType(incomeType);
        return this;
    }

    public Company hasTheFollowingInfo() {
        return company;
    }

    public CompanyBuilder build() {
        return this;
    }
}
