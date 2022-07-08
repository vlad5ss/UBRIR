import interfaces.Pagesss;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

public class SalaryTest implements Pagesss {


    @Owner(value = "Tylkovich Uladzislau")
    @Description("Salary test")
    @Test
    public void salaryTest()  {
        homePage.waitLoad().demoClick();
        financePage.isVisible().goToSalaryAccount().tapOnRefillButton() .tapOnFromMyAccountButton();;
    }
}
