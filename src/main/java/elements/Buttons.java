package elements;


import core.InitialDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Buttons {
    private AndroidDriver driver = InitialDriver.getDriver();

    public void clickElement(WebElement webElement) {
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

    public boolean isElementAvailable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }

    public boolean isElementSelected(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        try {
            wait.until(ExpectedConditions.elementToBeSelected(element));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }

    public boolean isElementEnable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }
}
