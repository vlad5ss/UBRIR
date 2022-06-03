package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    @AndroidFindBy(id = "cb.ibank:id/view_controller_welcome_title")
    private WebElement titleTxt;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_welcome_button_login")
    private  WebElement loginBtn;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_welcome_button_become_client")
    private WebElement client;
    @AndroidFindBy(id = "cb.ibank:id/include_department_addresses")
    private WebElement locationBtn;
    @AndroidFindBy(xpath = "cb.ibank:id/include_currency_rates")
    private WebElement ratesBtn;

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public  String getTitleBasePage() {
        return elements.getTextFromElement(titleTxt);
    }

    @Step("Sign in")
    public void login() {
        buttons.clickElement(loginBtn);
    }

    @Step("Wait load")
    public void waitLoad() {
        buttons.waitFirstPageLoad(loginBtn);
    }

    @Step("login button is displayed")
    public void loginButtonIsDisplayed() {
        buttons.isElementAvailable(loginBtn);
    }

    @Step("client button is displayed")
    public void clientButtonIsDisplayed() {
        buttons.isElementAvailable(client);
    }

    @Step("Click clients")
    public void clickClient() {
        buttons.clickElement(client);
    }

    @Step("client button is displayed")
    public void locationButtonIsDisplayed() {
        buttons.isElementAvailable(locationBtn);
    }

    @Step("Click clients")
    public void clickLocation() {
        buttons.clickElement(locationBtn);
    }

}
