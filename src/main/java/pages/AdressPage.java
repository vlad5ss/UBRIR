package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AdressPage extends BasePage {

    @AndroidFindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    public static WebElement TITLE_LOCATION;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Карта\"]")
    public static WebElement TAB_MAPS;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Карта\"]")
    private WebElement TAB_LIST;
    @AndroidFindBy(id = "cb.ibank:id/open_filter")
    private WebElement OPEN_FILTER;
    @AndroidFindBy(id = "android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private WebElement BACK;

    public AdressPage(AndroidDriver driver) {
        super(driver);
    }
}
