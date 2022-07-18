package demoversion;

import Base.BaseDemoVersion;
import interfaces.Pagesss;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScrollTest extends BaseDemoVersion implements Pagesss {

    private String DEMO_INVALID = "Недоступно в демо-режиме";
    private String INVISTEGATE = "Инвестировать";

    @Description("Scroll test")
    @Test
    public void scrollTest() {
        financePage.isVisible().scrolto(INVISTEGATE).clickOpenDeposit().cickDeposit().cickNextBtn();
        assertThat(transferPage.getDialog()).as("Dialog text").contains(DEMO_INVALID);
    }
}
