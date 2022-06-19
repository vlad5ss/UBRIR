import interfaces.Pagesss;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TransferTest implements Pagesss {

    private String WELCOME_TITLE = "Недоступно в демо-режимк";

    @Test
    public void mapTest() throws InterruptedException {
        homePage.waitLoad();
        homePage.demoClick();
        financePage.cickCart();
        newCreditPage.newMoneyTransfer();
        transferPage.transfer();
        assertThat(transferPage.getDialog()).as("Dialog text").contains(WELCOME_TITLE);
        Thread.sleep(40000);
    }
}
