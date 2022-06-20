import interfaces.Pagesss;
import org.testng.annotations.Test;

public class TransferTest implements Pagesss {

    private String WELCOME_TITLE = "Недоступно в демо-режиме";

    @Test
    public void creditTest() {
        homePage.waitLoad();
        homePage.demoClick();
        financePage.cickCart();
        newCreditPage.newMoneyTransfer();
        transferPage.transfer();
    }
}
