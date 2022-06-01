package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private AndroidDriver driver;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"По Логину\"]")
    public static WebElement TAB_LOGIN;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"По карте\"]")
    public static WebElement TAB_MAPS;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_login_login_title")
    private WebElement TITLE;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_login_button_forgot_login_or_password")
    private WebElement FORGOT_PASSWORD;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_login_button_login")
    private WebElement SIGN_IN;
    @AndroidFindBy(id = "android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private WebElement BACK;
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }
}
