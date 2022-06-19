import core.InitialDriver;
import interfaces.Pagesss;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MapPage;

public class MapTest implements Pagesss {

    @Test
    public void mapTest() {
        homePage.waitLoad();
        homePage.clickLocation();
        mapPage.allowPermessions();
        mapPage.scrollDown();
    }
}
