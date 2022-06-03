package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CreditCartPage extends BasePage {
    @AndroidFindBy(id = "cb.ibank:id/view_controller_sign_in_with_card_title")
    public static WebElement title;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_sign_in_with_card_field_card")
    private WebElement editCartTxt;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_sign_in_with_card_field_password")
    private WebElement editPasswordTxt;
    @AndroidFindBy(id = "cb.ibank:id/text_input_end_icon")
    private WebElement photoCartBtn;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_sign_in_with_card_forgot_password")
    private WebElement forgotPassBtn;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_sign_in_with_card_enter_button")
    private WebElement signIn;
    public CreditCartPage(AndroidDriver driver) {
        super(driver);
    }
}
