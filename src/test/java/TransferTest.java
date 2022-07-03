import interfaces.Pagesss;
import org.testng.annotations.Test;

public class TransferTest implements Pagesss {


    @Test
    public void creditTest() {
        homePage.waitLoad().demoClick();
        financePage.cickCart().newMoneyTransfer().transfer();
    }
}
