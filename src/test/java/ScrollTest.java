import interfaces.Pagesss;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScrollTest implements Pagesss {

    private String DEMO_INVALID = "Недоступно в демо-режиме";
    private String INVISTEGATE = "Инвестировать";

    @Owner(value = "Tylkovich Uladzislau")
    @Description("Scroll test")
    @Test
    public void scrollTest() {
        homePage.waitLoad().demoClick();
        financePage.isVisible().scrolto(INVISTEGATE).clickOpenDeposit().cickDeposit().cickNextBtn();
        assertThat(transferPage.getDialog()).as("Dialog text").contains(DEMO_INVALID);
    }
}
