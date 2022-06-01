package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    private AndroidDriver driver;

    @AndroidFindBy(id = "cb.ibank:id/view_controller_welcome_title")
    public static WebElement TITLE;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_welcome_button_login")
    public static WebElement LOGIN;
    @AndroidFindBy(id = "cb.ibank:id/view_controller_welcome_button_become_client")
    private WebElement CLIENT;
    @AndroidFindBy(id = "cb.ibank:id/include_department_addresses")
    private WebElement ADRESS;
    @AndroidFindBy(xpath = "cb.ibank:id/include_currency_rates")
    private WebElement RATES;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }




}
