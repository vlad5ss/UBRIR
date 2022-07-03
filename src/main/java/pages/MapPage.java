package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class MapPage extends BasePage {

    @AndroidFindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    public static WebElement titleLocation;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Карта\"]")
    public static WebElement tabMaps;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Карта\"]")
    private WebElement tabList;
    @AndroidFindBy(id = "cb.ibank:id/open_filter")
    private WebElement openFilter;
    @AndroidFindBy(id = "android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private WebElement back;
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private WebElement allowPermersion;

    public MapPage(AndroidDriver driver) {
        super(driver);
    }

    @Step("Allow permessions")
    public MapPage allowPermessions() {
        buttons.clickElement(allowPermersion);
        return this;
    }

    @Step("Scroll down")
    public void scrollDown() {
        screen.scrollDown(500);
    }
}
