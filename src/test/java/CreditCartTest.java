import Base.BaseTest;
import interfaces.Pagesss;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreditCartTest extends BaseTest implements Pagesss {

    @Description("Credit test")
    @Test
    public void creditCard() {
        homePage.waitLoad().login();
        loginPage.cickTabCart();
        assertThat(creditCartPage.titleCartIsDisplayed()).as("title cart is dis").isTrue();
    }
}
