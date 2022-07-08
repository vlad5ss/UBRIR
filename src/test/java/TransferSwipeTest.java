import interfaces.Pagesss;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

public class TransferSwipeTest implements Pagesss {


    @Owner(value = "Tylkovich Uladzislau")
    @Description("Swipe test")
    @Test
    public void swipeTest() throws InterruptedException {
        homePage.waitLoad().demoClick();
        Thread.sleep(40000);
        financePage.isVisible().swipeLeft();
        Thread.sleep(40000);
    }
}
