import interfaces.Pagesss;
import org.testng.annotations.Test;

public class SalaryTest implements Pagesss {

    @Test
    public void salaryTest()  {
        homePage.waitLoad().demoClick();
        financePage.isVisible().goToSalaryAccount().tapOnRefillButton() .tapOnFromMyAccountButton();;
    }
}
