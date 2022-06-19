package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;

public class TransferPage extends BasePage {
    private AndroidDriver driver;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_transfer_to_account_button_next")
    public static WebElement transfer;
    @AndroidFindBy(id = "cb.ibank:id/common_dialog_text")
    public static WebElement dialog;

    @Step("Click transfer")
    public void transfer() {
        buttons.clickElement(transfer);
    }

    public  String getDialog() {
        return elements.getTextFromElement(dialog);
    }
    public TransferPage(AndroidDriver driver) {
        super(driver);
    }
}
