import interfaces.Pagesss;
        import org.testng.annotations.Test;

public class MapTest implements Pagesss {

    @Test
    public void mapTest() {
        homePage.waitLoad().clickLocation();
        mapPage.allowPermessions().scrollDown();
    }
}
