package pages;

import enums.Direction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class DepositPage extends BasePage {
    private AndroidDriver driver;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_order_deposit_or_saving_account_button")
    public  WebElement depositBtn;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_order_deposit_or_saving_account_details_button")
    public  WebElement nextBtn;


    @Step("Click tab cart")
    public void cickDeposit() {
        buttons.clickElement(depositBtn);
    }

    @Step("Click tab cart")
    public void cickNextBtn() {
        buttons.clickElement(nextBtn);
    }

    public DepositPage(AndroidDriver driver) {
        super(driver);
    }

}
