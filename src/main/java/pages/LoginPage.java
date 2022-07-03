package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private AndroidDriver driver;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"По Логину\"]")
    public static WebElement tabLogin;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"По карте\"]")
    public static WebElement tabCart;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_login_login_title")
    private WebElement title;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_login_button_forgot_login_or_password")
    private WebElement forgotPassword;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_login_button_login")
    private WebElement signIn;
    @AndroidFindBy(id = "android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private WebElement back;

    @Step("Click tab cart")
    public LoginPage cickTabCart() {
        buttons.clickElement(tabCart);
        return this;
    }
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }
}
