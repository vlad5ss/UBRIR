import interfaces.Pagesss;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScrollTest implements Pagesss {

    private String DEMO_INVALID = "Недоступно в демо-режиме";

    @Test
    public void scrollTest() throws InterruptedException {
        homePage.waitLoad();
        homePage.demoClick();
        financePage.isVisible();
        financePage.scrolto("Инвестировать");
        financePage.clickOpenDeposit();
        depositPage.cickDeposit();
        depositPage.cickNextBtn();
        assertThat(transferPage.getDialog()).as("Dialog text").contains(DEMO_INVALID);
    }
}
