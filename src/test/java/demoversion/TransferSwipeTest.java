package demoversion;

import Base.BaseDemoVersion;
import interfaces.Pagesss;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TransferSwipeTest extends BaseDemoVersion implements Pagesss {


    @Description("Swipe test")
    @Test
    public void swipeTest() throws InterruptedException {
        Thread.sleep(40000);
        financePage.isVisible().swipeLeft();
        Thread.sleep(40000);
    }
}
