package demoversion;

import Base.BaseDemoVersion;
import interfaces.Pagesss;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TransferTest extends BaseDemoVersion implements Pagesss {

    @Description("Credit test")
    @Test
    public void creditTest() {
        financePage.cickCart().newMoneyTransfer().transfer();
    }
}
