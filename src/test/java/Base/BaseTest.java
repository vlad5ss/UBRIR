package Base;

import org.testng.annotations.AfterClass;

import static core.InitialDriver.getAndroidDriver;

public class BaseTest {

    @AfterClass
    public void afterMobileTests() {
        getAndroidDriver().resetApp();
        //TODO Через .startActivity для уменьшения логина
    }
}
