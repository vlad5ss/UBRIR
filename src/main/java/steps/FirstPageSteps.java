package steps;

import core.InitialDriver;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.BasePage.LOGIN;
import static pages.BasePage.TITLE;

public class FirstPageSteps {
    private AndroidDriver driver = InitialDriver.getDriver();

    public static String getTitleBasePage() {
        return TITLE.getText();
    }

    @Step("Sign in")
    public void login() {
        searchAndClickButtonBy(LOGIN);
//        LOGIN.click();
    }

    public void waitFirstPageLoad() {
      new WebDriverWait(driver, 15)
                .until(ExpectedConditions.elementToBeClickable(LOGIN));
    }

    public void searchAndClickButtonBy(WebElement webElement) {
        WebElement searchButton = new WebDriverWait(driver, 15)
                .until(ExpectedConditions.elementToBeClickable(webElement));
        searchButton.click();
    }

}
