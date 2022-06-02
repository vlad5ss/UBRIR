package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage {

    @AndroidFindBy(id = "cb.ibank:id/view_controller_welcome_title")
    public static WebElement TITLE;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_welcome_button_login")
    public static WebElement LOGIN;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_welcome_button_become_client")
    private WebElement CLIENT;
    @AndroidFindBy(id = "cb.ibank:id/include_department_addresses")
    private WebElement ADRESS;
    @AndroidFindBy(xpath = "cb.ibank:id/include_currency_rates")
    private WebElement RATES;

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    public static String getTitleBasePage() {
        return TITLE.getText();
    }

    @Step("Sign in")
    public void login() {
        buttons.searchAndClickButtonBy(LOGIN);
    }

    @Step("Wait load")
    public void waitLoad() {
        buttons.waitFirstPageLoad(LOGIN);
    }

//    public void waitFirstPageLoad() {
//        new WebDriverWait(driver, 20)
//                .until(ExpectedConditions.elementToBeClickable(LOGIN));
//    }
//
//    public void searchAndClickButtonBy(WebElement webElement) {
//        WebElement searchButton = new WebDriverWait(driver, 15)
//                .until(ExpectedConditions.elementToBeClickable(webElement));
//        searchButton.click();
//    }

}
