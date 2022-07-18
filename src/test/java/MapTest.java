import Base.BaseTest;
import interfaces.Pagesss;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

public class MapTest extends BaseTest implements Pagesss {

    @Description("Map test")
    @Test
    public void mapTest() {
       homePage.waitLoad().clickLocation();
        mapPage.allowPermessions().scrollDown();
    }
}
