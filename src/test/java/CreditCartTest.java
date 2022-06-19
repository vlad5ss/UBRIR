import interfaces.Pagesss;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreditCartTest implements Pagesss {

    @Test
    public void mapTest() {
        homePage.waitLoad();
        homePage.login();
        loginPage.cickTabCart();
        assertThat(creditCartPage.titleCartIsDisplayed()).as("title cart is dis").isTrue();
    }
}
