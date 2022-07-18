package demoversion;

import Base.BaseDemoVersion;
import interfaces.Pagesss;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class SalaryTest extends BaseDemoVersion implements Pagesss {


    @Description("Salary test")
    @Test
    public void salaryTest() {
        financePage.isVisible().goToSalaryAccount().tapOnRefillButton().tapOnFromMyAccountButton();
    }
}
