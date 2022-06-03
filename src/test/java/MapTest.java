import core.InitialDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MapPage;

public class MapTest {

    HomePage homePage = new HomePage(InitialDriver.getDriver());
    MapPage mapPage = new MapPage(InitialDriver.getDriver());

    @Test
    public void mapTest() {
        homePage.waitLoad();
        homePage.clickLocation();
        mapPage.allowPermessions();
        mapPage.scrollDown();
    }
}
