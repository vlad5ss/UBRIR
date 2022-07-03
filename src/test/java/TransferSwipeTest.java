import interfaces.Pagesss;
import org.testng.annotations.Test;

public class TransferSwipeTest implements Pagesss {

    @Test
    public void swipeTest() throws InterruptedException {
        homePage.waitLoad().demoClick();
        Thread.sleep(40000);
        financePage.isVisible().swipeRight();
        Thread.sleep(40000);
    }
}
