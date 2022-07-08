import interfaces.Pagesss;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

public class TransferTest implements Pagesss {

    @Owner(value = "Tylkovich Uladzislau")
    @Description("Credit test")
    @Test
    public void creditTest() {
        homePage.waitLoad().demoClick();
        financePage.cickCart().newMoneyTransfer().transfer();
    }
}
