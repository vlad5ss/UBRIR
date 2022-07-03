package pages;

import enums.Direction;
import interfaces.Pagesss;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class FinancePage extends BasePage implements Pagesss {

    private final Point paymentsPoint = screen.setPointForSwipe(1.25F, 2F);
    private AndroidDriver driver;
    @AndroidFindBy(id = "cb.ibank:id/saving_account_name")
    public  WebElement cardBtn;
    @AndroidFindBy(id = "cb.ibank:id/saving_account_money")
    public static WebElement savingMoney;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")
    public WebElement openDeposit;
    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[contains(@text, 'Зарплатный счет')]/..")
    public WebElement salaryAccount;

    @Step("Click tab cart")
    public NewCreditPage cickCart() {
        buttons.clickElement(cardBtn);
        return newCreditPage;
    }

    public FinancePage(AndroidDriver driver) {
        super(driver);
    }

    @Step("Click tab cart")
    public FinancePage isVisible() {
        buttons.isElementAvailable(cardBtn);
        return this;
    }

    @Step("Тапнуть на счет 'Зарплатный Счет'")
    public DemoAccountPage goToSalaryAccount() {
        buttons.clickElement(salaryAccount);
        return demoAccountPage;
    }

    @Step("Click open Deposit")
    public DepositPage clickOpenDeposit() {
        buttons.isElementAvailable(openDeposit);
        buttons.clickElement(openDeposit);
        return depositPage;
    }

    @Step("Swipe right")
    public void swipeLeft() {
        screen.swipeScreenWithPressTime(Direction.LEFT, 200, null);
    }

    @Step("Scrool to text")
    public FinancePage scrolto(String text) {
        screen.scrollablePage(text);
        return this;
    }
}
