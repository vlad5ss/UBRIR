package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class NewCreditPage extends BasePage {
    private AndroidDriver driver;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]")
    public static WebElement newMoney;


    @Step("Click tab cart")
    public void newMoneyTransfer() {
        buttons.clickElement(newMoney);
    }
    public NewCreditPage(AndroidDriver driver) {
        super(driver);
    }
}
