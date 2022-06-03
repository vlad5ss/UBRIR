import core.InitialDriver;
import org.testng.annotations.Test;
import pages.CreditCartPage;
import pages.HomePage;
import pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class CreditCartTest {
    HomePage homePage = new HomePage(InitialDriver.getDriver());
    LoginPage loginPage = new LoginPage(InitialDriver.getDriver());
    CreditCartPage creditCartPage = new CreditCartPage(InitialDriver.getDriver());

    @Test
    public void mapTest() {
        homePage.waitLoad();
        homePage.login();
        loginPage.cickTabCart();
        assertThat(creditCartPage.titleCartIsDisplayed()).as("title cart is dis").isTrue();
    }
}
