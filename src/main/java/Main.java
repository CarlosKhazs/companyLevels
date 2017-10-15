import Builder.CompanyBuilder;

/**
 * Created by carlos on 12/10/17.
 */
public class Main {
    public static void main(String[] args) {
        CompanyBuilder companyBuilder = new CompanyBuilder().buildCompany();

        companyBuilder.withTradeMark("Bawi")
                      .hasAEmployeesNumberOf(15)
                      .andTheMostIncomeComesFrom("")
                      .build();

        System.out.println("---------------------------------------------");

        companyBuilder.hasTheFollowingInfo().getTrademark();
        companyBuilder.hasTheFollowingInfo().getNumberOfEmployees();
        companyBuilder.hasTheFollowingInfo().getIncomeType();
        companyBuilder.hasTheFollowingInfo().doCompanyAudit();
        companyBuilder.hasTheFollowingInfo().doSupportContact();
        companyBuilder.hasTheFollowingInfo().payBills();

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        CompanyBuilder companyBuilder1 = new CompanyBuilder().buildCompany();

        companyBuilder1.withTradeMark("UNIPAM")
                       .hasAEmployeesNumberOf(1000)
                       .andTheMostIncomeComesFrom("investments")
                       .build();

        System.out.println("---------------------------------------------");

        companyBuilder1.hasTheFollowingInfo().getTrademark();
        companyBuilder1.hasTheFollowingInfo().getNumberOfEmployees();
        companyBuilder1.hasTheFollowingInfo().getIncomeType();
        companyBuilder1.hasTheFollowingInfo().doCompanyAudit();
        companyBuilder1.hasTheFollowingInfo().doSupportContact();
        companyBuilder1.hasTheFollowingInfo().payBills();
    }
}
