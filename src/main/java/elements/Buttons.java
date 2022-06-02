package elements;


import core.InitialDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Buttons {
    private AndroidDriver driver = InitialDriver.getDriver();

    public void searchAndClickButtonBy(WebElement webElement) {
        WebElement searchButton = new WebDriverWait(driver, 15)
                .until(ExpectedConditions.elementToBeClickable(webElement));
        searchButton.click();
    }

    public void buttonClose(WebElement webElement) {
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        webElement.click();

    }

        public void waitFirstPageLoad(WebElement element) {
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickButtonBackOnKeyboard() {
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
