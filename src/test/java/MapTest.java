import interfaces.Pagesss;
        import org.testng.annotations.Test;

public class MapTest implements Pagesss {

    @Test
    public void mapTest() {
        homePage.waitLoad();
        homePage.clickLocation();
        mapPage.allowPermessions();
        mapPage.scrollDown();
    }
}
