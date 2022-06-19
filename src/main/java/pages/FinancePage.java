package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class FinancePage extends BasePage {
    private AndroidDriver driver;
    @AndroidFindBy(id = "cb.ibank:id/saving_account_name")
    public static WebElement cardBtn;


    @Step("Click tab cart")
    public void cickCart() {
        buttons.clickElement(cardBtn);
    }
    public FinancePage(AndroidDriver driver) {
        super(driver);
    }
}
