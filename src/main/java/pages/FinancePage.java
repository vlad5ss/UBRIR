package pages;

import enums.Direction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class FinancePage extends BasePage {
    private AndroidDriver driver;
    @AndroidFindBy(id = "cb.ibank:id/saving_account_name")
    public  WebElement cardBtn;
    @AndroidFindBy(id = "cb.ibank:id/saving_account_money")
    public static WebElement savingMoney;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")
    public WebElement openDeposit;

    @Step("Click tab cart")
    public void cickCart() {
        buttons.clickElement(cardBtn);
    }

    public FinancePage(AndroidDriver driver) {
        super(driver);
    }

    @Step("Click tab cart")
    public void isVisible() {
        buttons.isElementAvailable(cardBtn);
    }

    @Step("Click open Deposit")
    public void clickOpenDeposit() {
        buttons.isElementAvailable(openDeposit);
        buttons.clickElement(openDeposit);
    }

    @Step("Swipe right")
    public void swipeRight() {
        screen.swipe(Direction.RIGHT);
    }

    @Step("Scrool to text")
    public void scrolto(String text) {
        screen.scrollablePage(text);
    }
}
