package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    @AndroidFindBy(id = "cb.ibank:id/view_controller_demo_version")
    public static WebElement demoVersion;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_welcome_title")
    public static WebElement titleTxt;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_welcome_button_login")
    public static WebElement loginBtn;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_welcome_button_become_client")
    public  WebElement client;
    @AndroidFindBy(id = "cb.ibank:id/include_department_addresses")
    public WebElement locationBtn;
    @AndroidFindBy(xpath = "cb.ibank:id/include_currency_rates")
    public WebElement ratesBtn;

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public  String getTitleBasePage() {
        return elements.getTextFromElement(titleTxt);
    }

    @Step("Sign in")
    public void login() {
        log.info("click login");
        buttons.clickElement(loginBtn);
    }

    @Step("Demo click")
    public void demoClick() {
        log.info("democlick");
        buttons.clickElement(demoVersion);
    }

    @Step("Wait load")
    public HomePage waitLoad() {
        log.info("wait for page load");
        buttons.waitFirstPageLoad(loginBtn);
        return this;
    }

    @Step("login button is displayed")
    public void loginButtonIsDisplayed() {
        log.info("login is displayed");
        buttons.isElementAvailable(loginBtn);
    }

    @Step("client button is displayed")
    public void clientButtonIsDisplayed() {
        log.info("client is displayed");
        buttons.isElementAvailable(client);
    }

    @Step("Click clients")
    public void clickClient() {
        log.info("click clients");
        buttons.clickElement(client);
    }

    @Step("client button is displayed")
    public void locationButtonIsDisplayed() {
        log.info("location is displayed");
        buttons.isElementAvailable(locationBtn);
    }

    @Step("Click clients")
    public void clickLocation() {
        log.info("click location");
        buttons.clickElement(locationBtn);
    }

}
