package Base;

import interfaces.Pagesss;
import org.testng.annotations.BeforeClass;


public class BaseDemoVersion extends BaseTest implements Pagesss {

    @BeforeClass
    public void goToDemoVersion() {
        homePage.waitLoad().demoClick();
    }
}
