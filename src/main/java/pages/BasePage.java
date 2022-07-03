package pages;

import elements.Buttons;
import elements.Elements;
import elements.Screen;
import elements.Waiters;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.PageFactory;

import static elements.Waiters.getWaiters;

public class BasePage {
    private AndroidDriver driver;
    protected Buttons buttons;
    protected Screen screen;
    protected Elements elements;
    protected Waiters waiters;
    public Logger log = Logger.getLogger(BasePage.class);

    public BasePage(AndroidDriver driver) {
        buttons = new Buttons();
        screen = new Screen();
        elements = new Elements();
        waiters = getWaiters();
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
