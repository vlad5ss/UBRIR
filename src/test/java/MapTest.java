import interfaces.Pagesss;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

public class MapTest implements Pagesss {


    @Owner(value = "Tylkovich Uladzislau")
    @Description("Map test")
    @Test
    public void mapTest() {
        homePage.waitLoad().clickLocation();
        mapPage.allowPermessions().scrollDown();
    }
}
