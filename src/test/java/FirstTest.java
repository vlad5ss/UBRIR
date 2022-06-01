import core.InitialDriver;
import org.testng.annotations.Test;
import pages.Advertisements;

public class FirstTest {

    Advertisements advertisements = new Advertisements(InitialDriver.getDriver());

    @Test
    public void pricesIsEquals() throws InterruptedException {
        Thread.sleep(40000);
    }
}
