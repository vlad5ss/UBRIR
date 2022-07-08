import interfaces.Pagesss;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreditCartTest implements Pagesss {

    @Owner(value = "Tylkovich Uladzislau")
    @Description("Credit test")
    @Test
    public void creditCard() {
        homePage.waitLoad().login();
        loginPage.cickTabCart();
        assertThat(creditCartPage.titleCartIsDisplayed()).as("title cart is dis").isTrue();
    }
}
